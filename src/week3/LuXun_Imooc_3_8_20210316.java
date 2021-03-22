package week3;


/**
 * 3-7 使用 Math 类操作数据
 * author:luxun
 * date:2020-03-16
 * Math 类位于 java.lang 包中，包含用于执行基本数学运算的方法， Math 类的所有方法都是静态方法，所以使用该类中的方法时，可以直接使用类名.方法名，
 * 如： Math.round();
 * 常用的方法：
 * 返回值      方法名     解释
 * long       round()   返回四舍五入后的整数
 * double     floor()   返回小于参数的最大整数
 * double     ceil()    返回大于参数的最小整数
 * double     random()  返回[0,1)之间的随机数浮点数
 */
public class LuXun_Imooc_3_8_20210316 {
    public static void main(String[] args) {

        // 定义一个整型数组，长度为10
        int[] nums = new int[10];

        //通过循环给数组赋值
        for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
            int x = (int) (Math.random() * 10);

            nums[i] = x;// 为元素赋值
        }

        // 使用foreach循环输出数组中的元素
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}