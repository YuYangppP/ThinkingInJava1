package practice.com.three;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Three.java
 * @Description TODO
 * @Date 2019/9/18 13:45
 */
public class Three {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        for(int i = 0; i < 25; i++) {
            int x = rand1.nextInt();
            int y = rand2.nextInt();
            if(x < y) {
                print(x + " < " + y);
            }else if(x > y) {
                print(x + " > " + y);
            }else {print(x + " = " + y);}
        }
        Random rand3 = new Random();
        Random rand4 = new Random();
        while(true) {
            //for(int i = 0; i < 25; i++) {
            int x = rand3.nextInt(10);
            int y = rand4.nextInt(10);
            if(x < y) {
                print(x + " < " + y);
            } else if(x > y) {
                print(x + " > " + y);
            } else {
                print(x + " = " + y);
            }
        }
    }
}
