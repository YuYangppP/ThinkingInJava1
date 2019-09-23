package practice4;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName VelocityCalculator.java
 * @Description TODO
 * @Date 2019/9/16 19:38
 */
public class VelocityCalculator {
    static float velocity(float d, float t) {
        if (t == 0) {
            return 0f;
        } else {
            return d / t;
        }
    }
}
