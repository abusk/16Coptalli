package com.coptalli.model;

import com.coptalli.board.AllPostion;

import java.util.Map;

/**
 * Created by abu on 7/5/17.
 */
public class Board {
    private String gameId;
    private Player player1;
    private Player player2;
    private Map<String, CPosition> allPostion;

    public Map<String, CPosition> getAllPostion() {
        return allPostion;
    }

    public void setAllPostion(Map<String, CPosition> allPostion) {
        this.allPostion = allPostion;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}
