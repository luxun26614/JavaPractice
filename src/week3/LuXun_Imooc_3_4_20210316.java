package week3;

/**
 * 3-4 Java 中基本类型和字符串之间的转换
 * author:luxun
 * date:2020-03-16
 * 基本类型转换为字符串有三种方法：
 * 1. 使用包装类的 toString() 方法
 * 2. 使用String类的 valueOf() 方法
 * 3. 用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串
 *
 * 将字符串转换成基本类型有两种方法：
 * 1. 调用包装类的 parseXxx 静态方法
 * 2. 调用包装类的 valueOf() 方法转换为基本类型的包装类，会自动拆箱任务
 *
 * 任务
 * 运行结果为：
 * m 转换为String型后与整数20的求和结果为： 78.520
 * str 转换为double型后与整数20的求和结果为： 200.2
 */
public class LuXun_Imooc_3_4_20210316 {
    public static void main(String[] args) {

        double m = 78.5;
        //将基本类型转换为字符串
        String str1 = String.valueOf(m);
        String str2 = m + "";

        System.out.println("m 转换为String型后与整数20的求和结果为： " + (str1 + 20));
        System.out.println("m 转换为String型后与整数20的求和结果为： " + (str2 + 20));

        String str = "180.20";
        // 将字符串转换为基本类型
        Double a = Double.valueOf(str);
        Double b = Double.parseDouble(str);

        System.out.println("str 转换为double型后与整数20的求和结果为： " + (a + 20));
        System.out.println("str 转换为double型后与整数20的求和结果为： " + (b + 20));
    }
}