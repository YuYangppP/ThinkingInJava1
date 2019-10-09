package com.nineteen;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Test19.java
 * @Description TODO
 * @Date 2019/10/9 19:36
 */
public class Test19 {

    public static void playGame(GaemFactory factory){
        Games games = factory.getGames();
        games.play();
    }
    public static void main(String[] args) {
        playGame(new CoinFactory());
        playGame(new ShaIZiFactory());
    }
}
