package week1;

/**
 * 3-3 Java中的赋值运算符
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 让我们赶紧来做个练习吧，亲...
 *
 * 请在编辑器中，空白处编写代码，应用赋值运算符实现如下结果：
 * three = one + two ==> 30
 * three += one ==> 40
 * three -= one ==> 30
 * three *= one ==> 300
 * three /= one ==> 30
 * three %= one ==>0
 */

public class LuXun_Imooc_3_3_20210302 {
    public static void main(String[] args) {
        int one = 10;
        int two = 20;
        int three = 0;

        three = one + two;
        System.out.println("three = one + two ==> " + three);

        three += one;
        System.out.println("three += one ==> " + three);

        three -= one;
        System.out.println("three -= one ==> " + three);

        three *= one;
        System.out.println("three *= one ==> " + three);

        three /= one;
        System.out.println("three /= one ==> " + three);

        three %= one;
        System.out.println("three %= one ==>" + three);

    }
}
