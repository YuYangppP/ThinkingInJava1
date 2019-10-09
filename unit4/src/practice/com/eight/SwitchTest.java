package practice.com.eight;

import static net.mindview.util.print.print;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName SwitchTest.java
 * @Description TODO
 * @Date 2019/9/18 14:59
 */
public class SwitchTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            switch (i){
                case 0: print("0000"); break;
                case 1: print("1111"); break;
                case 2: print("2222"); break;
                case 3: print("3333"); break;
                case 4: print("4444"); break;
                case 5: print("5555"); break;
                case 6: print("6666"); break;
                case 7: print("7777"); break;
                case 8: print("8888"); break;
                case 9: print("9999"); break;
                default: print("default");
            }
        }
    }
}
