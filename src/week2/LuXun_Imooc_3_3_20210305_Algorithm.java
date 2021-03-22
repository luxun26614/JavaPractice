package week2;

/**
 * 3-3 面向对象特性之封装
 * author:luxun
 * date:2020-03-05
 * 封装
 * 封装即隐藏功能的实现细节
 * 利用对象与方法是实现封装的直接途径
 * 良好的封装让代码更容易阅读与维护
 */

public class LuXun_Imooc_3_3_20210305_Algorithm {
    /**
     * 传入五个数，控制台打印升序结果
     *
     * @param a 第一个数
     * @param b 第二个数
     * @param c 第三个数
     * @param d 第四个数
     * @param e 第五个数
     */
    public void sort(int a, int b, int c, int d, int e) {
//        冒泡排序算法
        int[] arr = {a, b, c, d, e};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
//        放在其他类中调用
        LuXun_Imooc_3_3_20210305_Algorithm lia = new LuXun_Imooc_3_3_20210305_Algorithm();
        lia.sort(1, 3, 5,2, 6);
    }
}