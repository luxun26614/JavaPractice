package week1;

/**
 * 4-4 Java条件语句之嵌套if
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 请在代码编辑器中补全代码实现赛程设置：预赛成绩大于 80 分的可进入决赛，然后根据性别再划分为男子组决赛和女子组决赛。
 *
 * 运行结果为： 进入女子组决赛
 */

public class LuXun_Imooc_4_4_20210302 {
    public static void main(String[] args) {
        int score = 94;
        String sex = "女";

        if (score > 80) {
            System.out.println("分数可以进入决赛");

            if (sex == "女") {
                System.out.println("进入女子组决赛");
            } else {
                System.out.println("进入男子组决赛");
            }
        }

    }
}
