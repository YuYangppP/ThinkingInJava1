package com.nineteen;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName CoinFactory.java
 * @Description TODO
 * @Date 2019/10/9 19:27
 */
public class CoinFactory implements GaemFactory {
    @Override
    public Games getGames() {
        return new Coin();
    }
}
