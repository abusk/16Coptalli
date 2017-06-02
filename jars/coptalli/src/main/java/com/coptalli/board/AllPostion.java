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

    public Map<String, CPosition> getAllPositions(double x1, double y1,double x2, double y2){

        double xQ = (x2 - x1) / 4;
        double yQ = (y2 - y1) / 4;
        createPositions(x1, y2, xQ, yQ, 1);
        createPositions(x1, y2, xQ, -yQ, 17);
        return allPosition;
    }
    private void createPositions(double x1, double y2, double xQ, double yQ,int i) {

        CPosition cpos1 = new CPosition(x1 + "," + y2);
        cpos1.addConnectedNode((x1 + xQ) + "," + y2);
        cpos1.addConnectedNode(x1 + "," + (y2 - yQ));
        cpos1.addConnectedNode((x1 + xQ) + "," + (y2 - yQ));
        allPosition.put("c" + i++,cpos1);

        CPosition cpos2 = new CPosition((x1 + xQ) + "," + y2);
        cpos2.addConnectedNode(x1 + "," + y2);
        cpos2.addConnectedNode((x1 + xQ) + "," + (y2 - yQ));
        cpos2.addConnectedNode((x1 + 2 * xQ) + "," + y2);
        allPosition.put("c" + i++,cpos2);

        CPosition cpos3 = new CPosition((x1 + 2 * xQ) + "," + y2);
        cpos3.addConnectedNode((x1 + xQ) + "," + y2);
        cpos3.addConnectedNode((x1 + xQ) + "," + (y2 - yQ));
        cpos3.addConnectedNode((x1 + 2 * xQ) + "," + (y2 - yQ));
        cpos3.addConnectedNode((x1 + 3 * xQ) + "," + (y2 - yQ));
        cpos3.addConnectedNode((x1 + 3 * xQ) + "," + y2);
        cpos3.addConnectedNode((x1 + (3 * xQ / 2)) + "," + (y2 + yQ));
        cpos3.addConnectedNode((x1 + 2 * xQ + "," + (y2 + yQ)));
        cpos3.addConnectedNode((x1 + (5 * xQ / 2)) + "," + (y2 + yQ));
        allPosition.put("c" + i++,cpos3);

        CPosition cpos4 = new CPosition((x1 + 3 * xQ) + "," + y2);
        cpos4.addConnectedNode((x1 + 2 * xQ) + "," + y2);
        cpos4.addConnectedNode((x1 + 3 * xQ) + "," + (y2 - yQ));
        cpos4.addConnectedNode((x1 + 4 * xQ) + "," + y2);
        allPosition.put("c" + i++,cpos4);

        CPosition cpos5 = new CPosition((x1 + 4 * xQ) + "," + y2);
        cpos5.addConnectedNode((x1 + 3 * xQ) + "," + y2);
        cpos5.addConnectedNode((x1 + 3 * xQ) + "," + (y2 - yQ));
        cpos5.addConnectedNode((x1 + 4 * xQ) + "," + (y2 - yQ));
        allPosition.put("c" + i++,cpos5);

        CPosition cpos6 = new CPosition((x1 + 4 * xQ) + "," + (y2 - yQ));
        cpos6.addConnectedNode((x1 + 4 * xQ) + "," + (y2 - 2 * yQ));
        cpos6.addConnectedNode((x1 + 3 * xQ) + "," + (y2 - yQ));
        cpos6.addConnectedNode((x1 + 4 * xQ) + "," + y2 );
        allPosition.put("c" + i++,cpos6);

        CPosition cpos7 = new CPosition((x1 + 3 * xQ) + "," + (y2 - yQ));
        cpos7.addConnectedNode((x1 + 4 * xQ) + "," + (y2 - yQ));
        cpos7.addConnectedNode((x1 + 4 * xQ) + "," + (y2 - 2 * yQ));
        cpos7.addConnectedNode((x1 + 3 * xQ) + "," + (y2 - 2 * yQ));
        cpos7.addConnectedNode((x1 + 2 * xQ) + "," + (y2 - 2 * yQ));
        cpos7.addConnectedNode((x1 + 2 * xQ) + "," + (y2 - yQ));
        cpos7.addConnectedNode((x1 + 2 * xQ) + "," + y2 );
        cpos7.addConnectedNode((x1 + 3 * xQ) + "," + y2 );
        cpos7.addConnectedNode((x1 + 4 * xQ) + "," + y2);
        allPosition.put("c" + i++,cpos7);

        CPosition cpos8 = new CPosition((x1 + 2 * xQ) + "," + (y2 - yQ));
        cpos8.addConnectedNode((x1 + 3 * xQ) + "," + (y2 - yQ));
        cpos8.addConnectedNode((x1 + 2 * xQ) + "," + (y2 - 2 * yQ));
        cpos8.addConnectedNode((x1 + xQ) + "," + (y2 - yQ));
        cpos8.addConnectedNode((x1 + 2 * xQ) + "," + y2 );
        allPosition.put("c" + i++,cpos8);

        CPosition cpos9 = new CPosition((x1 + xQ) + "," + (y2 - yQ));
        cpos9.addConnectedNode((x1 + 2 * xQ) + "," + (y2 - yQ));
        cpos9.addConnectedNode((x1 + 2 * xQ) + "," + (y2 - 2 * yQ));
        cpos9.addConnectedNode((x1 + xQ) + "," + (y2 - 2 * yQ));
        cpos9.addConnectedNode( x1 + "," + (y2 - 2 * yQ));
        cpos9.addConnectedNode( x1 + "," + (y2 - yQ));
        cpos9.addConnectedNode( x1 + "," + y2 );
        cpos9.addConnectedNode((x1 + xQ) + "," + y2 );
        cpos9.addConnectedNode((x1 + 2 * xQ) + "," + y2);
        allPosition.put("c" + i++,cpos9);

        CPosition cpos10 = new CPosition( x1 + "," + (y2 - yQ));
        cpos10.addConnectedNode( x1 + "," + (y2 - 2 * yQ));
        cpos10.addConnectedNode((x1 + xQ) + "," + (y2 - yQ));
        cpos10.addConnectedNode( x1 + "," + y2 );
        allPosition.put("c" + i++,cpos10);

        CPosition cpos11 = new CPosition((x1 + (3 * xQ / 2)) + "," + (y2 + yQ));
        cpos11.addConnectedNode((x1 + 2 * xQ) + "," + y2);
        cpos11.addConnectedNode((x1 + 2 * xQ) + "," + (y2 + yQ));
        cpos11.addConnectedNode((x1 + xQ) + "," + (y2 + 2 * yQ));
        allPosition.put("c" + i++,cpos11);

        CPosition cpos12 = new CPosition((x1 + 2 * xQ) + "," + (y2 + yQ));
        cpos12.addConnectedNode((x1 + 2 * xQ) + "," + y2);
        cpos12.addConnectedNode((x1 + (3 * xQ / 2)) + "," + (y2 + yQ));
        cpos12.addConnectedNode((x1 + 2 * xQ) + "," + (y2 + 2 * yQ));
        cpos12.addConnectedNode((x1 + (5 * xQ / 2)) + "," + (y2 + yQ));
        allPosition.put("c" + i++,cpos12);

        CPosition cpos13 = new CPosition((x1 + (5 * xQ / 2)) + "," + (y2 + yQ));
        cpos13.addConnectedNode((x1 + 2 * xQ) + "," + y2);
        cpos13.addConnectedNode((x1 + 2 * xQ) + "," + (y2 + yQ));
        cpos13.addConnectedNode((x1 + 3 * xQ) + "," + (y2 + 2 * yQ));
        allPosition.put("c" + i++,cpos13);

        CPosition cpos14 = new CPosition((x1 + 3 * xQ) + "," + (y2 + 2 * yQ));
        cpos14.addConnectedNode((x1 + (5 * xQ / 2)) + "," + (y2 + yQ));
        cpos14.addConnectedNode((x1 + 2 * xQ) + "," + (y2 + 2 * yQ));
        allPosition.put("c" + i++,cpos14);

        CPosition cpos15 = new CPosition((x1 + 2 * xQ) + "," + (y2 + 2 * yQ));
        cpos15.addConnectedNode((x1 + 3 * xQ) + "," + (y2 + 2 * yQ));
        cpos15.addConnectedNode((x1 + 2 * xQ) + "," + (y2 + yQ));
        cpos15.addConnectedNode((x1 + xQ) + "," + (y2 + 2 * yQ));
        allPosition.put("c" + i++,cpos15);

        CPosition cpos16 = new CPosition((x1 + xQ) + "," + (y2 + 2 * yQ));
        cpos16.addConnectedNode((x1 + (3 * xQ / 2)) + "," + (y2 + yQ));
        cpos16.addConnectedNode((x1 + 2 * xQ) + "," + (y2 + 2 * yQ));
        allPosition.put("c" + i++,cpos16);

    }
}
