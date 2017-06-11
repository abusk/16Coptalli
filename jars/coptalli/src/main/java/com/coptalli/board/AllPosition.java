package com.coptalli.board;

import com.coptalli.model.CPosition;
import com.coptalli.model.Guthi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by abu on 27/5/17.
 */
public class AllPostion {
    private Map<String,CPosition> allPosition = new HashMap();

    public Map<String, CPosition> getAllPositions(int x1, int y1, int x2, int y2){

        int xQ = (x2 - x1) / 4;
        int yQ = (y2 - y1) / 4;
        int hY = y1 + (y2 - y1)/2;
        createMiddlePosition(x1, hY, xQ, yQ);
        createStartPositions(x1, hY, xQ, yQ, 1);
        createStartPositions(x1, hY, xQ, -yQ, 17);
        return allPosition;
    }
    private void createMiddlePosition(int x, int y, int xQ, int yQ){

        CPosition cpos33 = new CPosition(x + "," + y);
        cpos33.addConnectedNode(x + "," + (y + yQ));
        cpos33.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos33.addConnectedNode((x + xQ) + "," + y);
        cpos33.addConnectedNode((x + xQ) + "," + (y - yQ));
        cpos33.addConnectedNode(x + "," + (y - yQ));
        allPosition.put(x + "," + y, cpos33);

        CPosition cpos34 = new CPosition((x + xQ) + "," + y);
        cpos34.addConnectedNode(x + "," + y);
        cpos34.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos34.addConnectedNode((x + xQ) + "," + y);
        cpos34.addConnectedNode((x + xQ) + "," + (y - yQ));
        allPosition.put((x + xQ) + "," + y, cpos34);

        CPosition cpos35 = new CPosition((x + 2 * xQ) + "," + y);
        cpos35.addConnectedNode((x + xQ) + "," + y);
        cpos35.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos35.addConnectedNode((x + 2 * xQ) + "," + (y + yQ));
        cpos35.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos35.addConnectedNode((x + 3 * xQ) + "," + y);
        cpos35.addConnectedNode((x + 3 * xQ) + "," + (y - yQ));
        cpos35.addConnectedNode((x + 2 * xQ + "," + (y - yQ)));
        cpos35.addConnectedNode((x + xQ) + "," + (y - yQ));
        allPosition.put((x + 2 * xQ) + "," + y, cpos35);

        CPosition cpos36 = new CPosition((x + 3 * xQ) + "," + y);
        cpos36.addConnectedNode((x + 2 * xQ) + "," + y);
        cpos36.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos36.addConnectedNode((x + 4 * xQ) + "," + y);
        cpos36.addConnectedNode((x + 3 * xQ) + "," + (y - yQ));
        allPosition.put((x + 3 * xQ) + "," + y, cpos34);

        CPosition cpos37 = new CPosition((x + 4 * xQ) + "," + y);
        cpos37.addConnectedNode((x + 4 * xQ) + "," + (y + yQ));
        cpos37.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos37.addConnectedNode((x + 3 * xQ) + "," + y);
        cpos37.addConnectedNode((x + 3 * xQ) + "," + (y - yQ));
        cpos37.addConnectedNode((x + 3 * xQ) + "," + (y - yQ));
        allPosition.put((x + 4 * xQ) + "," + y, cpos37);

    }
    private void createStartPositions(int x, int y, int xQ, int yQ, int i) {

        CPosition cpos1 = new CPosition( x + "," + (y + yQ));
        cpos1.addConnectedNode( x + "," + y);
        cpos1.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos1.addConnectedNode( x + "," + (y + 2 * yQ) );
        allPosition.put(x + "," + (y + yQ), cpos1);

        CPosition cpos2 = new CPosition((x + xQ) + "," + (y + yQ));
        cpos2.addConnectedNode( x + "," + y );
        cpos2.addConnectedNode( x + "," + (y + yQ));
        cpos2.addConnectedNode( x + "," + (y + 2 * yQ));
        cpos2.addConnectedNode((x + xQ) + "," + (y + 2 * yQ));
        cpos2.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos2.addConnectedNode((x + 2 * xQ) + "," + (y + yQ));
        cpos2.addConnectedNode((x + 2 * xQ) + "," + y);
        cpos2.addConnectedNode((x + xQ) + "," + y );
        allPosition.put((x + xQ) + "," + (y + yQ), cpos2);

        CPosition cpos3 = new CPosition((x + 2 * xQ) + "," + (y + yQ));
        cpos3.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos3.addConnectedNode((x + 2 * xQ) + "," + y );
        cpos3.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos3.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        allPosition.put((x + 2 * xQ) + "," + (y + yQ), cpos3);

        CPosition cpos4 = new CPosition((x + 3 * xQ) + "," + (y + yQ));
        cpos4.addConnectedNode((x + 2 * xQ) + "," + y );
        cpos4.addConnectedNode((x + 2 * xQ) + "," + (y + yQ));
        cpos4.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos4.addConnectedNode((x + 3 * xQ) + "," + (y + 2 * yQ));
        cpos4.addConnectedNode((x + 4 * xQ) + "," + (y + 2 * yQ));
        cpos4.addConnectedNode((x + 4 * xQ) + "," + (y + yQ));
        cpos4.addConnectedNode((x + 4 * xQ) + "," + y);
        cpos4.addConnectedNode((x + 3 * xQ) + "," + y );
        allPosition.put((x + 3 * xQ) + "," + (y + yQ), cpos4);

        CPosition cpos5 = new CPosition((x + 4 * xQ) + "," + (y + yQ));
        cpos5.addConnectedNode((x + 4 * xQ) + "," + y);
        cpos5.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos5.addConnectedNode((x + 3 * xQ) + "," + (y + 2 * yQ) );
        allPosition.put((x + 4 * xQ) + "," + (y + yQ), cpos5);

        CPosition cpos6 = new CPosition((x + 4 * xQ) + "," + (y + 2 * yQ));
        cpos6.addConnectedNode((x + 3 * xQ) + "," + (y + 2 * yQ));
        cpos6.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos6.addConnectedNode((x + 4 * xQ) + "," + (y + yQ));
        allPosition.put((x + 4 * xQ) + "," + (y + yQ), cpos6);

        CPosition cpos7 = new CPosition((x + 3 * xQ) + "," + (y + 2 * yQ));
        cpos7.addConnectedNode((x + 4 * xQ) + "," + (y + 2 * yQ));
        cpos7.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos7.addConnectedNode((x + 3 * xQ) + "," + (y + yQ) );
        allPosition.put((x + 3 * xQ) + "," + (y + 2 * yQ), cpos7);

        CPosition cpos8 = new CPosition((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos8.addConnectedNode((x + xQ) + "," + (y + 2 * yQ));
        cpos8.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos8.addConnectedNode((x + 2 * xQ) + "," + (y + yQ));
        cpos8.addConnectedNode((x + 3 * xQ) + "," + (y + yQ));
        cpos8.addConnectedNode((x + 3 * xQ) + "," + (y + 2 * yQ));
        cpos8.addConnectedNode((x + (3 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos8.addConnectedNode((x + 2 * xQ )+ "," + (y + 3 * yQ));
        cpos8.addConnectedNode((x + (5 * xQ / 2)) + "," + (y + 3 * yQ));
        allPosition.put((x + 2 * xQ) + "," + (y + 2 * yQ), cpos8);

        CPosition cpos9 = new CPosition((x + xQ) + "," + (y + 2 * yQ));
        cpos9.addConnectedNode(x + "," + (y + 2 * yQ));
        cpos9.addConnectedNode((x + xQ) + "," + (y + yQ));
        cpos9.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        allPosition.put((x + xQ) + "," + (y + 2 * yQ), cpos9);

        CPosition cpos10 = new CPosition(x + "," + (y + 2 * yQ));
        cpos10.addConnectedNode((x + xQ) + "," + (y + 2 * yQ));
        cpos10.addConnectedNode(x + "," + (y + yQ));
        cpos10.addConnectedNode((x + xQ) + "," + (y + yQ));
        allPosition.put(x + "," + (y + 2 * yQ), cpos10);

        CPosition cpos11 = new CPosition((x + (3 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos11.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos11.addConnectedNode((x + 2 * xQ) + "," + (y + 3 * yQ));
        cpos11.addConnectedNode((x + xQ) + "," + (y + 4 * yQ));
        allPosition.put((x + (3 * xQ / 2)) + "," + (y + 3 * yQ), cpos11);

        CPosition cpos12 = new CPosition((x + 2 * xQ) + "," + (y + 3 * yQ));
        cpos12.addConnectedNode((x + 2 * xQ) + "," + (y + 2 * yQ));
        cpos12.addConnectedNode((x + (3 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos12.addConnectedNode((x + 2 * xQ) + "," + (y + 4 * yQ));
        cpos12.addConnectedNode((x + (5 * xQ / 2)) + "," + (y + 3 * yQ));
        allPosition.put((x + 2 * xQ) + "," + (y + 3 * yQ), cpos12);

        CPosition cpos13 = new CPosition((x + (5 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos13.addConnectedNode((x + 2 * xQ) + "," + (y + 2 *  yQ));
        cpos13.addConnectedNode((x + 2 * xQ) + "," + (y + 3 * yQ));
        cpos13.addConnectedNode((x + 3 * xQ) + "," + (y + 4 * yQ));
        allPosition.put((x + (5 * xQ / 2)) + "," + (y + 3 * yQ), cpos13);

        CPosition cpos14 = new CPosition((x + 3 * xQ) + "," + (y + 4 * yQ));
        cpos14.addConnectedNode((x + (5 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos14.addConnectedNode((x + 2 * xQ) + "," + (y + 4 * yQ));
        allPosition.put((x + 3 * xQ) + "," + (y + 4 * yQ), cpos14);

        CPosition cpos15 = new CPosition((x + 2 * xQ) + "," + (y + 4 * yQ));
        cpos15.addConnectedNode((x + 3 * xQ) + "," + (y + 4 * yQ));
        cpos15.addConnectedNode((x + 2 * xQ) + "," + (y + 3 * yQ));
        cpos15.addConnectedNode((x + xQ) + "," + (y + 4 * yQ));
        allPosition.put((x + 2 * xQ) + "," + (y + 4 * yQ), cpos15);

        CPosition cpos16 = new CPosition((x + xQ) + "," + (y + 4 * yQ));
        cpos16.addConnectedNode((x + (3 * xQ / 2)) + "," + (y + 3 * yQ));
        cpos16.addConnectedNode((x + 2 * xQ) + "," + (y + 4 * yQ));
        allPosition.put((x + xQ) + "," + (y + 4 * yQ), cpos16);

    }

    public static void main(String[] args) {
        AllPostion a = new AllPostion();
        Map<String, CPosition> allPos = a.getAllPositions(50,500, 150, 600);
        for (Map.Entry<String, CPosition> entry : allPos.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
    }
}
