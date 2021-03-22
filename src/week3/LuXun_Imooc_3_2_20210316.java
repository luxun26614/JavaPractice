package week3;

/**
 * 3-2 Java 中基本类型和包装类之间的转换
 * author:luxun
 * date:2020-03-16
 * 装箱：把基本类型转换成包装类，使其具有对象的性质，又可分为手动装箱和自动装箱
 * 拆箱：和装箱相反，把包装类对象转换成基本类型的值，又可分为手动拆箱和自动拆箱
 * <p>
 * 任务
 * 在编辑器中完成了基本类型和包装类之间的转换，即装箱和拆箱的操作。
 */
public class LuXun_Imooc_3_2_20210316 {
    public static void main(String[] args) {

        // 定义double类型变量
        double a = 91.5;

        // 手动装箱
        Double b = new Double(a);

        // 自动装箱
        Double c = a;

        System.out.println("装箱后的结果为：" + b + "和" + c);

        // 定义一个Double包装类对象，值为8
        Double d = new Double(87.0);

        // 手动拆箱
        double e = d.doubleValue();

        // 自动拆箱
        double f = d;

        System.out.println("拆箱后的结果为：" + e + "和" + f);
    }
}