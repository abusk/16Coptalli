package com.coptalli.model;

import java.util.List;

/**
 * Created by abu on 7/5/17.
 */
public class Player {
    private String payerId;
    private List<Guthi> guthis;
    private String userId;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }
    public List<Guthi> getGuthis() {
        return guthis;
    }

    public void setGuthis(List<Guthi> guthis) {
        this.guthis = guthis;
    }
}
