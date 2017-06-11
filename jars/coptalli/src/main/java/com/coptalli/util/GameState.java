package com.coptalli.util;

import com.coptalli.model.GameStatus;

/**
 * Created by taleb on 6/11/17.
 */
public enum GameState {

    RUNNING(0), WIN(1), DRAW(2);

    private int state;

    GameState(int state) {
        this.state = state;
    }
    public int state() {
        return this.state;
    }

}
