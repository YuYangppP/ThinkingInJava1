package com.eleven;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Cleanser.java
 * @Description TODO
 * @Date 2019/9/25 12:35
 */
public class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        System.out.print(x);
    }
}
