package com.coptalli.model;

/**
 * Created by abu on 6/5/17.
 */
public class Guthi {
    private CPosition position;
    private String guthId;
    private String playerId;


    public Guthi(String guthId, String playerId, CPosition cPosition){
        this.guthId = guthId;
        this.position = cPosition;
        this.playerId = playerId;
    }
    public String getGuthId() {return guthId;}

    public void setGuthId(String guthId) {
        this.guthId = guthId;
    }

    public CPosition getPosition() {
        return position;
    }

    public void setPosition(CPosition position) {
        this.position = position;
    }

    public String getPlayerId() {
        return playerId;
    }
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}
