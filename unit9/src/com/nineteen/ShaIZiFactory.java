package com.nineteen;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName ShaIZiFactory.java
 * @Description TODO
 * @Date 2019/10/9 19:34
 */
public class ShaIZiFactory implements GaemFactory {
    @Override
    public Games getGames() {
        return new ShaiZi();
    }
}
