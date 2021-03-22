package week1;

/**
 * 3-5 Java中的逻辑运算符
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 假设有 A 、 B 、 C 、 D 四个人投票，由他们决定投票是否通过，此时就到了逻辑运算符“大显身手”的时候了。请在编辑器中的第 7 、 8 、 9 、 10 行中填写代码，将程序补充完整
 *
 * 结合运行结果，相信可以帮助大家更好的理解逻辑运算符的应用~~
 * false 未通过
 * true 未通过
 * false 未通过
 * true 未通过
 */

public class LuXun_Imooc_3_5_20210302 {
    public static void main(String[] args) {
        boolean a = true; // a同意
        boolean b = false; // b反对
        boolean c = false; // c反对
        boolean d = true; // d同意
        System.out.println((a && b) + " 未通过");
        System.out.println((a || d) + " 未通过");
        System.out.println((!a) + " 未通过");
        System.out.println((c ^ d) + " 未通过");

    }
}
