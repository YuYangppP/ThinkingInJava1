package com.five.b;

import com.five.a.yu;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName TestYu.java
 * @Description TODO
 * @Date 2019/10/9 18:36
 */
public class TestYu implements yu {

    @Override
    public void eat() {
        System.out.println("麻辣烫");
    }

    @Override
    public void sleep() {
        System.out.println("早睡早起");
    }

    @Override
    public void code() {
        System.out.println("code code code");
    }

    public static void main(String[] args) {
        TestYu testYu = new TestYu();
        testYu.eat();
        testYu.sleep();
        testYu.code();
    }
}
