package week1;

/**
 * 2-11 Java常量的应用
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 小伙伴们，我们也来定义一个常量玩玩吧！
 *
 * 请在编辑器中，定义两个常量，分别用于保存用户的性别，并实现打印输出
 */

//**char类型定义变量的值要用单引号（')**
//常量名一般使用**大写字符**


public class LuXun_Imooc_2_11_20210302 {
    public static void main(String[] args) {
        final char MALE = '男';
        final char FEMALE = '女';

        System.out.println("MALE: " + MALE);
        System.out.println("FEMALE: " + FEMALE);

    }
}
