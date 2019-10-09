package com.three;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Son.java
 * @Description TODO
 * @Date 2019/10/9 17:51
 */
public class Son extends Dad {
    private int i = 1;
    @Override
    protected void print() {
        System.out.println("Son.i = "+ i );
    }
}
