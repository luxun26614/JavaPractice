package week1;

/**
 * 5-1 编程练习
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 温馨提示: 先试着自己独立完成，木有思路了也表着急。在后面 3 个小节中， 老师将分别讲解本小节练习的解析思路、优化的方案以及如何通过Eclipse的调试功能辅助代码开发
 */

public class LuXun_Imooc_5_1_20210302 {
    public static void main(String[] args) {

        // 变量保存成绩
        int score = 53;

        // 变量保存加分次数
        int count = 0;

        //打印输出加分前成绩
        System.out.println("加分前成绩：" + score);

        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
        while (score < 60) {
            score += 1;
            count++;
        }

        //打印输出加分后成绩，以及加分次数
        System.out.println("加分后成绩：" + score);
        System.out.println("加分次数：" + count);

    }
}
