package week1;

/**
 * 3-8 Java中运算符的优先级
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 请在编辑器中的第 5 行输入如下代码，​相信结合运行结果，大家会对运算符的优先级会有更加清晰的理解！
 * int x = (m * 8 / (n + 2)) % m;
 * 运行结果：
 * m:5
 * n:7
 * x:4
 */

public class LuXun_Imooc_3_8_20210302 {
    public static void main(String[] args) {
        int m = 5;
        int n = 7;
        int x = (m * 8 / (n + 2)) % m;
        System.out.println("m:" + m);
        System.out.println("n:" + n);
        System.out.println("x:" + x);
    }
}
