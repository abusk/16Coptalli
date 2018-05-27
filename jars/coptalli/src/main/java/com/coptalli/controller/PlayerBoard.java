package com.coptalli.board;

import com.coptalli.model.CPosition;
import com.coptalli.model.Guthi;
import com.coptalli.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by abu on 7/5/17.
 */
public class PlayerBoard {


    public static Player createPlayer1(Map<String,CPosition> allPosition, String userId){
        Player player = new Player();
        player.setPayerId("player1");
        player.setUserId(userId);
        player.setGuthis(createPlayerGuthis("player1",1,allPosition));
        return player;
    }
    public static Player createPlayer2(Map<String,CPosition> allPosition, String userId){
        Player player = new Player();
        player.setPayerId("player2");
        player.setUserId(userId);
        player.setGuthis(createPlayerGuthis("player2",17,allPosition));
        return player;
    }

    public static List<Guthi> createPlayerGuthis(String playerId, int count, Map<String,CPosition> allPosition) {

        List<Guthi> playerGuthi = new ArrayList<>();
        for (int i = count; i < count+16; i++) {
            CPosition position = allPosition.get("c" + i);
            Guthi g = new Guthi("g" + i, playerId, position);
            playerGuthi.add(g);
        }
        return playerGuthi;
    }
}
