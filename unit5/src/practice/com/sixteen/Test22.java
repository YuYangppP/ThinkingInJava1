package practice.com.sixteen;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Test22.java
 * @Description TODO
 * @Date 2019/9/22 22:16
 */
public class Test22 {
    private Test21 test21;

    public Test22(Test21 test21) {
        this.test21 = test21;
    }

    public static void main(String[] args) {
        Test22 test22 = new Test22(Test21.SHIKUAI);
        test22.describe();
    }
    /**
    * @Param: NULL
    * @return: void
    * @Author: YuYang
    * @Date: 22:25
    */
    void describe(){
        switch (test21){
            case YIMAO:
                System.out.println("一毛");
                break;
            case YIKUAI:
                System.out.println("一块");
                break;
            case WUKUAI:
                System.out.println("五块");
                break;
            case ERSHIKUAI:
                System.out.println("二十块");
                break;
            case WUSHIKUAI:
                System.out.println("五十块");
                break;
                default:
                    System.out.println("error");
        }
    }

}
