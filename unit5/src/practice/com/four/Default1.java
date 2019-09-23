package practice.com.four;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Default1.java
 * @Description TODO
 * @Date 2019/9/18 17:57
 */
public class Default1 {
    public Default1() {
        System.out.println("默认构造器");
    }
    public Default1(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Default1 d1 = new Default1();
        Default1 d2 = new Default1("重载构造器");

    }
}
