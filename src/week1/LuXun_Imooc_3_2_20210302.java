package week1;

/**
 * 3-2 Java中的算数运算符
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 亲，算术运算符的使用你学会了吗？让我们来检验一下吧。
 *
 * 请在编辑器的指定行中输入代码实现功能
 *
 * 第7行：求取四个年龄的总和
 *
 * 第8行：求取四个年龄的平均值
 *
 * 第9行：求取 age1 和 age2 的差值
 *
 * 第10行：求取 age1 自减后的年龄
 * 运行结果如图所示：
 * 年龄总和：105
 * 平均年龄：26.0
 * 年龄差值：6
 * 自减后的年龄：23
 */

public class LuXun_Imooc_3_2_20210302 {
    public static void main(String[] args) {
        int age1 = 24;
        int age2 = 18;
        int age3 = 36;
        int age4 = 27;
        int sum = age1 + age2 + age3 + age4;
        double avg = sum / 4;
        int minus = age1 - age2;
        int newAge = --age1;
        System.out.println("年龄总和：" + sum);
        System.out.println("平均年龄：" + avg);
        System.out.println("年龄差值：" + minus);
        System.out.println("自减后的年龄：" + newAge);

    }
}
