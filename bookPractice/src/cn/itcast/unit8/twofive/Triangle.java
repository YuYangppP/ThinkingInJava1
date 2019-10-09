//: polymorphism/shape/Triangle.java
package cn.itcast.unit8.twofive;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void message() {
        System.out.println("hello triangle");
    }
} ///:~
