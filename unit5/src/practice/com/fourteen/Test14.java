package practice.com.fourteen;
/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Test14.java
 * @Description TODO
 * @Date 2019/9/22 21:06
 */
public class Test14 {
    static String a = "hello world";

    static String b;

    static {
        b = "hello world 2";
    }

    public static void main(String[] args) {
        System.out.print(Test14.a);
        System.out.print(Test14.b);
        //hello world
        //hello world 2
    }
}
