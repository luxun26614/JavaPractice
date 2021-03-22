package week1;

/**
 * 3-4 Java中的比较运算符
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 验证一下你的学习成果吧！
 *
 * 请在编辑器中的第 7 、 8 、 9 、 10 行中添加正确的比较运算符，实现如下运行结果：
 * a等于b：false
 * a大于b：true
 * a小于等于b：false
 * str1等于str2：false
 */

public class LuXun_Imooc_3_4_20210302 {
    public static void main(String[] args) {
        int a = 16;
        double b = 9.5;
        String str1 = "hello";
        String str2 = "imooc";
        System.out.println("a等于b：" + (a == b));
        System.out.println("a大于b：" + (a > b));
        System.out.println("a小于等于b：" + (a <= b));
        System.out.println("str1等于str2：" + (str1 == str2));
    }
}
