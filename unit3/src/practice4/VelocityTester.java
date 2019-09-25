package practice4;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName VelocityTester.java
 * @Description TODO
 * @Date 2019/9/16 19:38
 */
public class VelocityTester {
    public static void main(String[] args) {
        float d = 350.5f;
        float t = 5.5f;
        System.out.print("距离是：" + d);
        System.out.print("时间是：" + t);
        float v = VelocityCalculator.velocity(d, t);
        System.out.print("速度是：" + v);
    }

}
