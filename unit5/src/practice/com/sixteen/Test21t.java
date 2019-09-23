package practice.com.sixteen;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Test21t.java
 * @Description TODO
 * @Date 2019/9/22 22:12
 */
public class Test21t {
    public static void main(String[] args) {
        for (Test21 e : Test21.values()){
            System.out.print(e);
            System.out.println(":" + e.ordinal());
        }
    }
}
