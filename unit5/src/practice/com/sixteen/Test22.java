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
                System.out.print("一毛");
                break;
            case YIKUAI:
                System.out.print("一块");
                break;
            case WUKUAI:
                System.out.print("五块");
                break;
            case ERSHIKUAI:
                System.out.print("二十块");
                break;
            case WUSHIKUAI:
                System.out.print("五十块");
                break;
                default:
                    System.out.print("error");
        }
    }

}
