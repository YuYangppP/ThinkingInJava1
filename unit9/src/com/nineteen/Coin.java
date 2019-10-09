package com.nineteen;

import java.util.Random;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Coin.java
 * @Description TODO
 * @Date 2019/10/9 19:19
 */
public class Coin implements Games {

    Random r = new Random();
    @Override
    public void play() {
        switch (r.nextInt(2)){
            case 0:
                System.out.println("正面");
                break;
            case 1:
                System.out.println("反面");
                break;
            default:
                System.out.println(".......");
                break;
        }
    }
}
