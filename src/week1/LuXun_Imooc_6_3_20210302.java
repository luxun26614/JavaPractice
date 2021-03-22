package week1;

/**
 * 6-3 如何使用Java中的数组
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 小伙伴们，数组的使用步骤你掌握了么，让我们来检验下吧。
 *
 * 在编辑器中定义了一个数组 subjects ，用于保存考试科目信息，请在第 5、14 行中将代码填写完整，输出数组中的第四个科目信息。
 *
 * 运行结果为： 数组中第4个科目为：Java
 */

public class LuXun_Imooc_6_3_20210302 {
    public static void main(String[] args) {

        // 定义一个长度为5的字符串数组，保存考试科目信息
        String[] subjects = new String[5];

        // 分别为数组中的元素赋值
        subjects[0] = "Oracle";
        subjects[1] = "PHP";
        subjects[2] = "Linux";
        subjects[3] = "Java";
        subjects[4] = "HTML";

        System.out.println("数组中第4个科目为：" + subjects[3]);
    }
}
