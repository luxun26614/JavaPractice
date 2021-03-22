package week2;

/**
 * 2-4 方法的作用
 * author:luxun
 * date:2020-03-05
 * 方法（Method）用于完成特定功能的整段代码
 */

public class LuXun_Imooc_2_4_20210305 {
    public static void ss(int x) {
        if (x % 2 == 0) {
            System.out.println(x + "是偶数");
        } else {
            System.out.println(x + "是奇数");
        }
    }

    //    方法有类型，表示方法有返回值返回值，如果是void表示没有返回值
    public String isOddNumber(int num) {
        System.out.println("原始数字是" + num);

        if (num % 2 == 0) {
            return "偶数";
        } else {
            return "奇数";
        }
    }

    public static void main(String[] xrgs) {
//        int a = 5;
//        LuXun_Imooc_2_4_20210305.ss(a);

        int a = 5;
        int b = 11;

        LuXun_Imooc_2_4_20210305 li = new LuXun_Imooc_2_4_20210305();

        System.out.println(a + "是" + li.isOddNumber(a));
        System.out.println(b + "是" + li.isOddNumber(b));
    }
}