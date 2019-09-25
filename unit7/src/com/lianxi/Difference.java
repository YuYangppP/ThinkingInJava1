package com.lianxi;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Difference.java
 * @Description TODO
 * @Date 2019/9/25 15:11
 */
class Test {
    Test() {
        print("Test()");
    }
}

public class Difference {
    private String name;

    public Difference(String s) {
        name = s;
    }

    static final Test sft = new Test();
    private final Test ft = new Test();
    static final String SFS = "static final";
    private final String fs = "final";
    private static Random rand = new Random();
    static final int SFI = rand.nextInt();
    private final int fi = rand.nextInt();

    @Override
    public String toString() {
        return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);
    }

    public static void main(String[] args) {
        Difference d1 = new Difference("d1");
        Difference d2 = new Difference("d2");
        Difference d3 = new Difference("d3");
        print(d1);
        print(d2);
        print(d3);
    }
}