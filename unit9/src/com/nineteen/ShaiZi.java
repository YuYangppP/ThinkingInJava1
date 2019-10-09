package com.nineteen;

import java.util.Random;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName ShaiZi.java
 * @Description TODO
 * @Date 2019/10/9 19:24
 */
public class ShaiZi implements Games{

    Random r = new Random();
    @Override
    public void play() {
        System.out.println("骰子的数字是："+(r.nextInt(6)+1));
    }
}
