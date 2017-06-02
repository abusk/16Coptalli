package com.coptalli.util;


import java.util.Random;

/**
 * Created by abu on 7/5/17.
 */
public class Utility {
    public static String creatGameId(String playerId){
        Random random = new Random();
        return playerId + "-" + random.nextInt(10000);
    }

    public static void main(String[] args) {
        System.out.println(creatGameId("abu"));
    }
}
