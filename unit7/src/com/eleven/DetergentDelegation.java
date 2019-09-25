package com.eleven;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName DetergentDelegation.java
 * @Description TODO
 * @Date 2019/9/25 12:37
 */
public class DetergentDelegation {
    private String s = "DetergentDelegation";
    Cleanser c = new Cleanser();

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        c.dilute();
    }

    public void apply() {
        c.apply();
    }

    public void scrub() {
        append(" Detergent.scrub()");
        c.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    @Override
    public String toString() {
        return s + "" + c;
    }

    public static void main(String[] args) {
        DetergentDelegation d = new DetergentDelegation();
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        System.out.print(d);
        System.out.print("Test base class:");
        Cleanser.main(args);
    }
}
