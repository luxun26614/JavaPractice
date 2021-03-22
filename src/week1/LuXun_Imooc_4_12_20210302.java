package week1;

/**
 * 4-12 Java循环跳转语句之continue
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 实现功能：求 1 到 10 之间的所有偶数的和。
 *
 * 实现思路：定义一个变量 sum 保存累加值，定义一个变量 i 保存 1 到 10 之间的整数，循环遍历并进行判断，如果 i 不能被 2 整除，则结束本次循环，继续执行下一次循环，否则进行累加求和。
 *
 * 请将右边编辑器中的第 9、10 行语句补充完整。
 *
 * 运行结果为： 1到10之间的所有偶数的和为：30
 */

public class LuXun_Imooc_4_12_20210302 {
    public static void main(String[] args) {

        int sum = 0; // 保存累加值

        for (int i = 1; i <= 10; i++) {

            // 如果i为奇数,结束本次循环，进行下一次循环
            if (i % 2 == 1) {
                continue;
            }

            sum = sum + i;
        }

        System.out.print("1到10之间的所有偶数的和为：" + sum);
    }
}
