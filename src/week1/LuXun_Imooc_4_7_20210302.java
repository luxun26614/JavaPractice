package week1;

/**
 * 4-7 Java循环语句之while
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 一起来感受一下 while 的魅力吧！
 *
 * 实现功能：顺序输出 1 ～ 5 这 5 个数字。
 *
 * 实现思路：使用一个变量 i 代表 1 - 5 之间的数字，值从 1 开始，每次循环时输出 i 的值，并且对 i 的值加 1 ，只要 i 小于等于数字 5 就执行该循环
 *
 * 请在编辑器中的第 7 行，将 while 语句的条件补充完整，程序运行结果：
 * 1
 * 2
 * 3
 * 4
 * 5
 */

public class LuXun_Imooc_4_7_20210302 {
    public static void main(String[] args) {

        int i = 1; // 代表 1 - 5 之间的数字

        // 当变量小于等于 5 时执行循环
        while (i <= 5) {

            // 输出变量的值，并且对变量加 1，以便于进行下次循环条件判断
            System.out.println(i);
            i++;
        }
    }
}
