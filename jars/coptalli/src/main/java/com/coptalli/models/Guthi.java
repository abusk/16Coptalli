package com.coptalli.model;

/**
 * Created by abu on 6/5/17.
 */
public class Guthi {
    private CPosition gCPosition;
    private String guthiId;
    private String playerId;



    public Guthi(String guthiId, String playerId, CPosition cPosition){
        this.guthiId = guthiId;
        this.gCPosition = cPosition;
        this.playerId = playerId;
    }

    public CPosition getgCPosition() {
        return gCPosition;
    }

    public void setgCPosition(CPosition gCPosition) {
        this.gCPosition = gCPosition;
    }

    public String getGuthId() {
        return guthiId;
    }

    public void setGuthId(String guthiId) {
        this.guthiId = guthiId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}
