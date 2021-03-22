package week1;

/**
 * 6-6 编程练习
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 任务要求：
 *
 * 1、 定义一个整型数组，并赋初值 61, 23, 4, 74, 13, 148, 20
 *
 * 2、 定义变量分别保存最大值、最小值、累加值和平均值，并假设数组中的第一个元素既为最大值又为最小值
 *
 * 3、 使用 for 循环遍历数组中的元素，分别与假定的最大值和最小值比较。如果比假定的最大值要大，则替换当前的最大值；如果比假定的最小值要小，则替换当前的最小值
 *
 * 4、 循环执行过程中对数组中的元素进行累加求和
 *
 * 5、 循环结束根据累加值计算平均值，并打印输出相关内容
 * 运行效果：
 * 数组中的最大值：148
 * 数组中的最小值：4
 * 数组中的平均值：49.0
 */

public class LuXun_Imooc_6_6_20210302 {
    public static void main(String[] args) {

        // 定义一个整型数组，并赋初值
        int[] nums = new int[]{61, 23, 4, 74, 13, 148, 20};

        int max = nums[0]; // 假定最大值为数组中的第一个元素
        int min = nums[0]; // 假定最小值为数组中的第一个元素
        double sum = 0;// 累加值
        double avg = 0;// 平均值

        for (int i = 0; i < nums.length; i++) { // 循环遍历数组中的元素
            // 如果当前值大于max，则替换max的值
            if (max <= nums[i]) {
                max = nums[i];
            }


            // 如果当前值小于min，则替换min的值
            if (min >= nums[i]) {
                min = nums[i];
            }


            // 累加求和
            sum += nums[i];

        }

        // 求平均值
        avg = sum / nums.length;

        System.out.println("数组中的最大值：" + max);
        System.out.println("数组中的最小值：" + min);
        System.out.println("数组中的平均值：" + avg);
    }
}
