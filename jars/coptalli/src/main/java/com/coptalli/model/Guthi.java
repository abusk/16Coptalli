package com.coptalli.model;

/**
 * Created by abu on 6/5/17.
 */
public class Guthi {
    private CPosition gPosition;
    private String guthId;
    private String playerId;


    public Guthi(String guthId, String playerId, CPosition cPosition){
        this.guthId = guthId;
        this.gPosition = cPosition;
        this.playerId = playerId;
    }
    public String getGuthId() {return guthId;}

    public void setGuthId(String guthId) {
        this.guthId = guthId;
    }

    public CPosition getPosition() {
        return gPosition;
    }

    public void setPosition(CPosition position) {
        this.gPosition = position;
    }

    public String getPlayerId() {
        return playerId;
    }
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}
