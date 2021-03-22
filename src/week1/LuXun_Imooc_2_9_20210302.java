package week1;

/**
 * 2-9 Java中的自动类型转换
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 小伙伴们，让我们再来感受下自动类型转换吧
 *
 * 在编辑器中，代码功能为：定义三个变量，分别用来保存：考试平均分、增长值、调整后的平均分
 *
 * 期望运行结果为：
 *
 * 现在第 5 行存在错误，你能找到并修改正确么？
 */

//double类型存储8个字节，int类型存储4个字节
//int类型可以自动转换为double类型

public class LuXun_Imooc_2_9_20210302 {
    public static void main(String[] args) {
        double avg1 = 78.5;
        int rise = 5;
        double avg2 = avg1 + rise;
        System.out.println("考试平均分：" + avg1);
        System.out.println("调整后的平均分：" + avg2);
    }
}
