package week1;

/**
 * 4-3 Java条件语句之多重if
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 小伙伴们，一起来解决个年龄问题吧。
 *
 * 请在编辑器中应用多重 if 语句，补全代码实现如下功能：
 *
 * 假设年龄大于 60 岁，则提示“老年”；如果年龄介于 40 岁至 60 岁之间，则提示“中年”；如果年龄介于 18 岁至 40 岁之间，则提示“少年”； 18 岁以下则提示“童年”
 *
 * 运行结果为： 少年
 */

public class LuXun_Imooc_4_3_20210302 {
    public static void main(String[] args) {
        int age = 25;

        if (age > 60) {
            System.out.println("老年");
        } else if (age >= 40) {
            System.out.println("中年");
        } else if (age >= 18) {
            System.out.println("少年");
        } else if (age < 18) {
            System.out.println("童年");
        }

    }
}
