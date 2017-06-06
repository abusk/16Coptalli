package com.coptalli.board;

import com.coptalli.model.Board;
import com.coptalli.model.CPosition;
import com.coptalli.model.Player;
import com.coptalli.model.PlayerInfo;
import com.coptalli.util.Utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abu on 7/5/17.
 */
public class BoardController {
    public static Map<String,Board> boards = new HashMap<>();

    public static String createGame(String userId, String startPos, String endPos){
        String gameId = Utility.creatGameId(userId);

        String [] startxy = startPos.split(",");
        String [] endxy = endPos.split(",");

        double x1 = Double.parseDouble(startxy[0]);
        double y1 = Double.parseDouble(startxy[1]);
        double x2 = Double.parseDouble(endxy[0]);
        double y2 = Double.parseDouble(endxy[1]);
        Map<String, CPosition> allPosition  = createAllPosition(x1, y1, x2, y2);
        Player player1 = PlayerBoard.createPlayer1(allPosition, userId);
        Board board = new Board();
        board.setGameId(gameId);
        board.setAllPostion(allPosition);
        board.setPlayer1(player1);
        boards.put(gameId, board);
        return gameId;
    }
    public static Map<String, CPosition> createAllPosition(double x1, double y1, double x2, double y2){
        AllPostion all = new AllPostion();
        return all.getAllPositions(x1, y1, x2, y2);
    }
    public static String joinGame(String gameId, String userId){
        Board board = boards.get(gameId);
        if(board != null) {
            if (board.getPlayer2() == null) {
                Player player2 = PlayerBoard.createPlayer2(board.getAllPostion(), userId);
                board.setPlayer2(player2);
                return board.getPlayer1().getUserId();
            }
            else
                return null;
        }
        else
            return null;
    }

    public static boolean login(String userId, String password){
        return true;
    }
    public static boolean signup(PlayerInfo info){
        return true;
    }
    public static boolean move(String gameId, String playerId, String toPosition, String fromPosition){
        return true;
    }
    public static boolean jump(String gameId, String playerId, String toPosition, String fromPosition, String jumpPosition){
        return true;
    }
    public static Board play(String gameId, String playerId){
        Board b = boards.get(gameId);
        return b;
    }

}
