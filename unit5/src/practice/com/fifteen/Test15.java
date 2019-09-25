package practice.com.fifteen;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Test15.java
 * @Description TODO
 * @Date 2019/9/22 21:04
 */
public class Test15 {
    String a;

    {
        a = "hello world";
    }

    public static void main(String[] args) {
        Test15 test15 = new Test15();
        System.out.print(test15.a);
        //hello world
    }
}
