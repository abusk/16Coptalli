package com.coptalli.model;

/**
 * Created by abu on 6/5/17.
 */
public class NextNode {
    private CPosition nextNode;
    private boolean jumpOver;

    public CPosition getNextNode() {
        return nextNode;
    }

    public void setNextNode(CPosition nextNode) {
        this.nextNode = nextNode;
    }

    public boolean isJumpOver() {
        return jumpOver;
    }

    public void setJumpOver(boolean jumpOver) {
        this.jumpOver = jumpOver;
    }
}
