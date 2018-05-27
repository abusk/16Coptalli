package com.coptalli.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abu on 27/5/17.
 */
public class AllPosition {
    private Map<String,CPosition> allPosition = new HashMap<>();

    /**
     *
     * @param x1 start x position
     * @param y1 start y position
     * @param x2 end y position
     * @param y2 end y position
     * @return a map of CPosition
     */
    public Map<String, CPosition> getAllPositions(int x1, int y1, int x2, int y2){

        int xQ = (x2 - x1) / 4;
        int yQ = (y2 - y1) / 4;
        int hY = y1 + (y2 - y1)/2;
        createMiddlePosition(x1, hY, xQ, yQ);
        createStartPositions(x1, hY, xQ, yQ, 1);
        createStartPositions(x1, hY, xQ, -yQ, 17);
        return allPosition;
    }

    /**
     *
     * @param x start X position
     * @param y half of(y2 - y1)
     * @param xQ quarter of (x2 -x1)
     * @param yQ quarter of (y2 -y1)
     */
    private void createMiddlePosition(int x, int y, int xQ, int yQ){

        CPosition cpos33 = new CPosition(x + "," + y);
        cpos33.addConnectedNode(x + "," + (y + yQ));
        cpos33.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos33.addConnectedNode((x + xQ) + "," + y);
        cpos33.addConnectedNode((x + xQ) + "," + (y - yQ));
        cpos33.addConnectedNode(x + "," + (y - yQ));
        cpos33.setPositionId("c33");
        allPosition.put("c33",cpos33);

        CPosition cpos34 = new CPosition((x + xQ) + "," + y);
        cpos34.addConnectedNode(x + "," + y);
        cpos34.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos34.addConnectedNode((x + xQ) + "," + y);
        cpos34.addConnectedNode((x + xQ) + "," + (y - yQ));
        cpos34.setPositionId("c34");
        allPosition.put("c34",cpos34);

        CPosition cpos35 = new CPosition((x + 2 * xQ) + "," + y);
        cpos35.addConnectedNode((x + xQ) + "," + y);
        cpos35.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos35.addConnectedNode((x + 2 * xQ) + "," + (y + yQ));
        cpos35.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos35.addConnectedNode((x + 3 * xQ) + "," + y);
        cpos35.addConnectedNode((x + 3 * xQ) + "," + (y - yQ));
        cpos35.addConnectedNode((x + 2 * xQ + "," + (y - yQ)));
        cpos35.addConnectedNode((x + xQ) + "," + (y - yQ));
        cpos35.setPositionId("c35");
        allPosition.put("c35",cpos35);

        CPosition cpos36 = new CPosition((x + 3 * xQ) + "," + y);
        cpos36.addConnectedNode((x + 2 * xQ) + "," + y);
        cpos36.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos36.addConnectedNode((x + 4 * xQ) + "," + y);
        cpos36.addConnectedNode((x + 3 * xQ) + "," + (y - yQ));
        cpos36.setPositionId("c36");
        allPosition.put("c36",cpos34);

        CPosition cpos37 = new CPosition((x + 4 * xQ) + "," + y);
        cpos37.addConnectedNode((x + 4 * xQ) + "," + (y + yQ));
        cpos37.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos37.addConnectedNode((x + 3 * xQ) + "," + y);
        cpos37.addConnectedNode((x + 3 * xQ) + "," + (y - yQ));
        cpos37.addConnectedNode((x + 3 * xQ) + "," + (y - yQ));
        cpos37.setPositionId("c37");
        allPosition.put("c37",cpos37);

    }

    /**
     *
     * @param x start X position
     * @param y half of (y2 - y1)
     * @param xQ quarter of (x2 -x1)
     * @param yQ quarter of (y2 -y1)
     * @param i  guthi id increment
     */
    private void createStartPositions(int x, int y, int xQ, int yQ, int i) {

        CPosition cpos1 = new CPosition( x + "," + (y + yQ));
        cpos1.addConnectedNode( x + "," + y);
        cpos1.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos1.addConnectedNode( x + "," + (y + 2 * yQ) );
        String pos1 = "c" + i++;
        cpos1.setPositionId(pos1);
        allPosition.put(pos1, cpos1);

        CPosition cpos2 = new CPosition((x + xQ) + "," + (y + yQ));
        cpos2.addConnectedNode( x + "," + y );
        cpos2.addConnectedNode( x + "," + (y + yQ));
        cpos2.addConnectedNode( x + "," + (y + 2 * yQ));
        cpos2.addConnectedNode((x + xQ) + "," + (y + 2 * yQ));
        cpos2.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos2.addConnectedNode((x + 2 * xQ) + "," + (y + yQ));
        cpos2.addConnectedNode((x + 2 * xQ) + "," + y);
        cpos2.addConnectedNode((x + xQ) + "," + y );
        String pos2 = "c" + i++;
        cpos2.setPositionId(pos2);
        allPosition.put(pos2, cpos2);

        CPosition cpos3 = new CPosition((x + 2 * xQ) + "," + (y + yQ));
        cpos3.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos3.addConnectedNode((x + 2 * xQ) + "," + y );
        cpos3.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos3.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        String pos3 = "c" + i++;
        cpos3.setPositionId(pos3);
        allPosition.put(pos3, cpos3);

        CPosition cpos4 = new CPosition((x + 3 * xQ) + "," + (y + yQ));
        cpos4.addConnectedNode((x + 2 * xQ) + "," + y );
        cpos4.addConnectedNode((x + 2 * xQ) + "," + (y + yQ));
        cpos4.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos4.addConnectedNode((x + 3 * xQ) + "," + (y + 2 * yQ));
        cpos4.addConnectedNode((x + 4 * xQ) + "," + (y + 2 * yQ));
        cpos4.addConnectedNode((x + 4 * xQ) + "," + (y + yQ));
        cpos4.addConnectedNode((x + 4 * xQ) + "," + y);
        cpos4.addConnectedNode((x + 3 * xQ) + "," + y );
        String pos4 = "c" + i++;
        cpos4.setPositionId(pos4);
        allPosition.put(pos4, cpos4);

        CPosition cpos5 = new CPosition((x + 4 * xQ) + "," + (y + yQ));
        cpos5.addConnectedNode((x + 4 * xQ) + "," + y);
        cpos5.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos5.addConnectedNode((x + 3 * xQ) + "," + (y + 2 * yQ) );
        String pos5 = "c" + i++;
        cpos5.setPositionId(pos5);
        allPosition.put(pos5, cpos5);

        CPosition cpos6 = new CPosition((x + 4 * xQ) + "," + (y + 2 * yQ));
        cpos6.addConnectedNode((x + 3 * xQ) + "," + (y + 2 * yQ));
        cpos6.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos6.addConnectedNode((x + 4 * xQ) + "," + (y + yQ));
        String pos6 = "c" + i++;
        cpos6.setPositionId(pos6);
        allPosition.put(pos6, cpos6);

        CPosition cpos7 = new CPosition((x + 3 * xQ) + "," + (y + 2 * yQ));
        cpos7.addConnectedNode((x + 4 * xQ) + "," + (y + 2 * yQ));
        cpos7.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos7.addConnectedNode((x + 3 * xQ) + "," + (y + yQ) );
        String pos7 = "c" + i++;
        cpos7.setPositionId(pos7);
        allPosition.put(pos7, cpos7);

        CPosition cpos8 = new CPosition((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos8.addConnectedNode((x + xQ) + "," + (y + 2 * yQ));
        cpos8.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos8.addConnectedNode((x + 2 * xQ) + "," + (y + yQ));
        cpos8.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos8.addConnectedNode((x + 3 * xQ) + "," + (y + 2 * yQ));
        cpos8.addConnectedNode((x + (3 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos8.addConnectedNode((x + 2 * xQ )+ "," + (y + 3 * yQ));
        cpos8.addConnectedNode((x + (5 * xQ / 2)) + "," + (y + 3 * yQ));
        String pos8 = "c" + i++;
        cpos8.setPositionId(pos8);
        allPosition.put(pos8, cpos8);

        CPosition cpos9 = new CPosition((x + xQ) + "," + (y + 2 * yQ));
        cpos9.addConnectedNode(x + "," + (y + 2 * yQ));
        cpos9.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos9.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        String pos9 = "c" + i++;
        cpos9.setPositionId(pos9);
        allPosition.put(pos9, cpos9);

        CPosition cpos10 = new CPosition(x + "," + (y + 2 * yQ));
        cpos10.addConnectedNode((x + xQ) + "," + (y + 2 * yQ));
        cpos10.addConnectedNode(x + "," + (y + yQ));
        cpos10.addConnectedNode((x + xQ) + "," + (y + yQ));
        String pos10 = "c" + i++;
        cpos10.setPositionId(pos10);
        allPosition.put(pos10, cpos10);

        CPosition cpos11 = new CPosition((x + (3 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos11.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos11.addConnectedNode((x + 2 * xQ) + "," + (y + 3 * yQ));
        cpos11.addConnectedNode((x + xQ) + "," + (y + 4 * yQ));
        String pos11 = "c" + i++;
        cpos11.setPositionId(pos11);
        allPosition.put(pos11, cpos11);

        CPosition cpos12 = new CPosition((x + 2 * xQ) + "," + (y + 3 * yQ));
        cpos12.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos12.addConnectedNode((x + (3 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos12.addConnectedNode((x + 2 * xQ) + "," + (y + 4 * yQ));
        cpos12.addConnectedNode((x + (5 * xQ / 2)) + "," + (y + 3 * yQ));
        String pos12 = "c" + i++;
        cpos12.setPositionId(pos12);
        allPosition.put(pos12, cpos12);

        CPosition cpos13 = new CPosition((x + (5 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos13.addConnectedNode((x + 2 * xQ) + "," + (y + 2 *  yQ));
        cpos13.addConnectedNode((x + 2 * xQ) + "," + (y + 3 * yQ));
        cpos13.addConnectedNode((x + 3 * xQ) + "," + (y + 4 * yQ));
        String pos13 = "c" + i++;
        cpos13.setPositionId(pos13);
        allPosition.put(pos13, cpos13);

        CPosition cpos14 = new CPosition((x + 3 * xQ) + "," + (y + 4 * yQ));
        cpos14.addConnectedNode((x + (5 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos14.addConnectedNode((x + 2 * xQ) + "," + (y + 4 * yQ));
        String pos14 = "c" + i++;
        cpos14.setPositionId(pos14);
        allPosition.put(pos14, cpos14);

        CPosition cpos15 = new CPosition((x + 2 * xQ) + "," + (y + 4 * yQ));
        cpos15.addConnectedNode((x + 3 * xQ) + "," + (y + 4 * yQ));
        cpos15.addConnectedNode((x + 2 * xQ) + "," + (y + 3 * yQ));
        cpos15.addConnectedNode((x + xQ) + "," + (y + 4 * yQ));
        String pos15 = "c" + i++;
        cpos15.setPositionId(pos15);
        allPosition.put(pos15, cpos15);

        CPosition cpos16 = new CPosition((x + xQ) + "," + (y + 4 * yQ));
        cpos16.addConnectedNode((x + (3 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos16.addConnectedNode((x + 2 * xQ) + "," + (y + 4 * yQ));
        String pos16 = "c" + i++;
        cpos16.setPositionId(pos16);
        allPosition.put(pos16, cpos16);
    }

    public static void main(String[] args) {
        AllPosition a = new AllPosition();
        Map<String, CPosition> allPos = a.getAllPositions(50,500, 150, 600);
        for (Map.Entry<String, CPosition> entry : allPos.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
    }
}
