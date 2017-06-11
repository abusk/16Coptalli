package com.coptalli.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abu on 6/5/17.
 */
public class CPosition {

    private String position;
    private String positionId;
    private List<String> connectedNodes = new ArrayList<>();

    public CPosition(String position){

        this.position  = position;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
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

    public void setConnectedNodes(List<String> connectedNodes) {
        this.connectedNodes = connectedNodes;
    }

    public void addConnectedNode(String connectedNode) {
        connectedNodes.add(connectedNode);
    }
    public String toString(){
        StringBuilder cPos = new StringBuilder();
        cPos.append("Position : " + "("+ position + ")"+"\n");
        cPos.append("Connected Pos : [" );
        StringBuilder cNodes = new StringBuilder();
        for (String s : connectedNodes){
            cNodes.append("("+s+"),");
        }
        cNodes.append("]");
        cNodes.toString();
        cPos.append(cNodes);
        return cPos.toString();
    }
}
