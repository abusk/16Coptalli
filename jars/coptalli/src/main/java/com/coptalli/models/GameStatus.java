package com.coptalli.model;

import com.coptalli.util.GameState;

/**
 * Created by taleb on 6/11/17.
 */
public class GameStatus {
    private GameState status;
    private String player;
    private String lock;

    public GameState getStatus() {
        return status;
    }
    public void setStatus(GameState status) {
        this.status = status;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getLock() {
        return lock;
    }

    public void setLock(String lock) {
        this.lock = lock;
    }
}
