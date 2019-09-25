package com.sixteen;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Amphibian.java
 * @Description TODO
 * @Date 2019/9/25 14:45
 */
public class Amphibian {
    protected void run(){
        System.out.print("go go go");
    }

    protected void sleep(){
        System.out.print("hu hu hu");
    }

    void eat(){
        System.out.print("zi zi zi");
    }

    static void study(Amphibian a){
        System.out.print("Amphibian study");
        a.eat();
    }
}
