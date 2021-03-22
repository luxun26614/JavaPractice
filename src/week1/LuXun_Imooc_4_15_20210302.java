package week1;

/**
 * 4-15 编程练习
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 给定一个小于10位的数，判断它是几位数。
 *
 * 例如：输入999，则输出 “它是个3位的数！”
 */

public class LuXun_Imooc_4_15_20210302 {
    public static void main(String[] args) {
        int num = 999;
        int count = 0;

        if (num >= 0  && num<=999999999){
            while(num != 0){
                count++;
                num/=10;
            }
            System.out.println("它是个"+ count+"位的数！");
        } else{
            System.out.println("输入有误！");
        }

    }
}
