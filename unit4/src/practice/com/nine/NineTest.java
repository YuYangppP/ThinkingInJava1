package practice.com.nine;

import java.util.Scanner;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName NineTest.java
 * @Description TODO
 * @Date 2019/9/18 15:09
 */
public class NineTest {
    int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return (fib(n - 2) + fib(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int k = sc.nextInt();
        NineTest f = new NineTest();
        for (int i = 0; i < k; i++) {
            System.out.println(f.fib(i));
        }
    }
}
