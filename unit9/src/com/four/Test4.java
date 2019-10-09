package com.four;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Test4.java
 * @Description TODO
 * @Date 2019/10/9 18:25
 */
public class Test4 {
    public static void testPrint(Dad1 d){
        ((Son1)d).print();
    }

    public static void testPrint2(Dad2 d2){
        d2.print();
    }

    public static void main(String[] args) {
        Son1 son1 = new Son1();
        Test4.testPrint(son1);

        Son2 son2 = new Son2();
        Test4.testPrint2(son2);
    }
}
