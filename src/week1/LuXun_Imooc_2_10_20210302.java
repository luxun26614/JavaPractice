package week1;

/**
 * 2-10 Java中的强制类型转换
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 练习时间又到了，一起来做个填空题吧！
 *
 * 在编辑器中，定义了两个变量，请将第 4 行中的错误修改完整，将身高的平均值强制转换为整数值。
 *
 * 运行结果如图所示：
 * 176.2
 * 176
 */

//**double类型强制转换为int类型**
//强制类型转换会造成数据丢失

public class LuXun_Imooc_2_10_20210302 {
    public static void main(String[] args) {
        double heightAvg1 = 176.2;
        int heightAvg2 = (int) heightAvg1;
        System.out.println(heightAvg1);
        System.out.println(heightAvg2);
    }
}
