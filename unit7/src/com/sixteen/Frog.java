package com.sixteen;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Frog.java
 * @Description TODO
 * @Date 2019/9/25 14:47
 */
public class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog f = new Frog();
        f.eat();
        f.run();
        f.sleep();
        Amphibian.study(f);
    }
}
