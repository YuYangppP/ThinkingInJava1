package practice.com.two;

import java.util.Random;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName RandomOne.java
 * @Description TODO
 * @Date 2019/9/18 13:31
 */
public class RandomOne {
    public static void main(String[] args) {
        Random random1 = new Random();
        Random random2 = new Random();
        for (int i = 0; i < 25; i++) {
            int x = random1.nextInt(100);
            int y = random2.nextInt(100);
            if (x < y) {
                System.out.print(x + "<" + y);
            } else if (x > y) {
                System.out.print(x + ">" + y);
            } else {
                System.out.print(x+"="+y);
            }
        }
    }
}
