//: polymorphism/shape/Square.java
package cn.itcast.unit8.twofive;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void message() {
        System.out.println("hello square");
    }
} ///:~
