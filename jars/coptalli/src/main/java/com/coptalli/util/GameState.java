package com.coptalli.util;

/**
 * Created by taleb on 6/11/17.
 */
public enum GameState {

    CREATED(0), READY(1), RUNNING(2), WIN(3), DRAW(4);

    private int state;

    GameState(int state) {
        this.state = state;
    }
    public int state() {
        return this.state;
    }

}
