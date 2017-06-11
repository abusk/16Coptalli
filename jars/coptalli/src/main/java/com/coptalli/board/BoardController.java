package com.coptalli.board;

import com.coptalli.model.*;
import com.coptalli.util.Utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by abu on 7/5/17.
 */
public class BoardController {
    public static Map<String,Board> boards = new HashMap<>();

    public static boolean login(String userId, String password){
        return true;
    }
    public static boolean signup(PlayerInfo info){
        return true;
    }

    /**
     *
     * @param userId
     * @param startPos
     * @param endPos
     * @return
     */
    public static String createGame(String userId, String startPos, String endPos){
        String gameId = Utility.creatGameId(userId);

        String [] startxy = startPos.split(",");
        String [] endxy = endPos.split(",");

        int x1 = Integer.parseInt(startxy[0]);
        int y1 = Integer.parseInt(startxy[1]);
        int x2 = Integer.parseInt(endxy[0]);
        int y2 = Integer.parseInt(endxy[1]);
        Map<String, CPosition> allPosition  = createAllPosition(x1, y1, x2, y2);
        Player player1 = PlayerBoard.createPlayer1(allPosition, userId);
        Board board = new Board();
        board.setGameId(gameId);
        board.setAllPostion(allPosition);
        board.setPlayer1(player1);
        boards.put(gameId, board);
        return gameId;
    }

    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static Map<String, CPosition> createAllPosition(int x1, int y1, int x2, int y2){
        AllPosition all = new AllPosition();
        return all.getAllPositions(x1, y1, x2, y2);
    }

    /**
     *
     * @param gameId
     * @param userId
     * @return
     */
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

    /**
     *
     * @param gameId
     * @param playerId
     * @param startPos
     * @param endPos
     * @param toBeDeleted
     * @return
     */
    public static Board move(String gameId, String playerId, String startPos, String endPos, List<String> toBeDeleted){
        Board board = boards.get(gameId);
        List<Guthi> guthiList;
        if (board != null){
            Player player1;
            Player player2;
            if (playerId.equals("player1")){
                player1 = board.getPlayer1();
                guthiList = player1.getGuthis();
                player1.setGuthis(replaceGuthi(gameId, "player1", startPos, endPos,guthiList));
                player2 = board.getPlayer2();
                if (!toBeDeleted.isEmpty())
                    player2.setGuthis(deleteGuthis(gameId,"player2",toBeDeleted));
            }
            else {
                player2 = board.getPlayer2();
                guthiList = player2.getGuthis();
                player2.setGuthis(replaceGuthi(gameId, "player2", startPos, endPos,guthiList));
                player1 = board.getPlayer1();
                if (!toBeDeleted.isEmpty())
                    player1.setGuthis(deleteGuthis(gameId,"player1",toBeDeleted));
            }
            board.setPlayer1(player1);
            board.setPlayer2(player2);
            boards.put(gameId,board);
        }
        return board;
    }

    /**
     *
     * @param gameId generated gameId using playerId.
     * @param playerId playerId between (player1 and player2)
     * @param startPos start position (positionId)
     * @param endPos end position (positionId)
     * @param guthis old list of guthi
     * @return new list of guthi
     */
    public static List<Guthi> replaceGuthi(String gameId, String playerId, String startPos, String endPos, List<Guthi> guthis){
        Board board = boards.get(gameId);
        Guthi oldGuthi = null;
        Guthi newGuthi = null;
        for (Guthi guthi : guthis) {
            if (startPos.equals(guthi.getgCPosition().getPositionId())){
                CPosition newCPosition = board.getAllPostion().get(endPos);
                newGuthi = new Guthi(guthi.getGuthId(),playerId, newCPosition);
                oldGuthi = guthi;
                break;
            }
        }
        guthis.remove(oldGuthi);
        guthis.add(newGuthi);
        return guthis;
    }

    /**
     *
     * @param gameId generated gameId using playerId.
     * @param playerId playerId between (player1 and player2)
     * @param toBeDeleted list of will be deleted position
     * @return returns list of guthi
     */
    public static List<Guthi> deleteGuthis(String gameId, String playerId, List<String> toBeDeleted){
        Board board = boards.get(gameId);
        List<Guthi> guthiList;
        List<Guthi> newGuthiList = new ArrayList<>();

        if (playerId.equals("player1")) {
            Player player1 = board.getPlayer1();
            guthiList = player1.getGuthis();
        }
        else {
            Player player2 = board.getPlayer2();
            guthiList = player2.getGuthis();
        }
        for (String pos : toBeDeleted) {
            for (Guthi guthi : guthiList) {
                if (pos.equals(guthi.getgCPosition().getPositionId())) {
                    newGuthiList.add(guthi);
                    break;
                }
            }
        }
        for (Guthi guthi : newGuthiList){
            guthiList.remove(guthi);
        }
        return guthiList;
    }

    /**
     *
     * @param gameId generated gameId
     * @param playerId playerId
     * @return
     */
    public static Board play(String gameId, String playerId){
        Board b = boards.get(gameId);
        return b;
    }

}
