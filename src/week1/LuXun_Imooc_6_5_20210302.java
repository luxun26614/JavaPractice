package week1;

/**
 * 6-5 使用循环操作Java中的数组
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 请在编辑器中第 9 行后空白处将代码补充完整，实现数组元素输出的功能
 *
 * 运行结果
 * 循环输出数组中元素的值：
 * sports
 * game
 * movie
 */

public class LuXun_Imooc_6_5_20210302 {
    public static void main(String[] args) {

        // 定义一个长度为 3 的字符串数组，并赋值初始值
        String[] hobbys = {"sports", "game", "movie"};
        System.out.println("循环输出数组中元素的值：");

        // 使用循环遍历数组中的元素
        for (int i = 0; i < hobbys.length; i++) {
            System.out.println(hobbys[i]);
        }

    }
}
