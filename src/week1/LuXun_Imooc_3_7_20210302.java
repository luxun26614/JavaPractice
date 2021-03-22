package week1;

/**
 * 3-7 Java中的条件运算符
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 快来加入条件运算符的练习吧！
 *
 * 在编辑器中的第 4 行输入代码，应用关系运算符实现 “判断：如果 score 大于或等于 60 ，输出及格，反之输出不及格“
 *
 * 运行结果为： 考试成绩如何：及格
 */

public class LuXun_Imooc_3_7_20210302 {
    public static void main(String[] args) {
        int score = 68;
        String mark = (score >= 60) ? "及格" : "不及格";
        System.out.println("考试成绩如何：" + mark);
    }
}
