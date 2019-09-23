package practice.com.nine;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @Date 2019/9/22 17:54
 */
public class Test {
    String s = "ss";
    public Test(String ss) {
        System.out.println("t1:"+ss);
        s = ss;
    }
    public Test(){
        this("my ss");
        System.out.println("t2");
    }

    public void prints(){
        System.out.println("s:"+s);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.prints();
    }
}
