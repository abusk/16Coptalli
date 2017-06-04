package com.coptalli.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abu on 6/5/17.
 */
public class CPosition {

    private String position;
    private List<String> connectedNodes = new ArrayList<>();
    public CPosition(String pos){
        this.position  = pos;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<String> getConnectedNodes() {
        return connectedNodes;
    }

    public void addConnectedNode(String connectedNode) {
        connectedNodes.add(connectedNode);
    }
}
