package week3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 3-7 Calendar 类的应用
 * author:luxun
 * date:2020-03-16
 * Date 类最主要的作用就是获得当前时间，同时这个类里面也具有设置时间以及一些其他的功能，但是由于本身设计的问题，这些方法却遭到众多批评，不建议使用，更推荐使用 Calendar 类进行时间和日期的处理。
 * java.util.Calendar 类是一个抽象类，可以通过调用 getInstance() 静态方法获取一个 Calendar 对象，此对象已由当前日期时间初始化，即默认代表当前时间，
 * 如 Calendar c = Calendar.getInstance();
 *
 * Calendar 类提供了 getTime() 方法，用来获取 Date 对象，完成 Calendar 和 Date 的转换，
 * 还可通过 getTimeInMillis() 方法，获取此 Calendar 的时间值，以毫秒为单位。
 *
 * 任务
 * 代码编辑器中实现获取 Calendar 对象，并转换为指定格式的时间。
 * 运行结果：
 * 当前时间：2021-03-16 14:18:49
 */
public class LuXun_Imooc_3_7_20210316 {
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar c = Calendar.getInstance();

                // 将Calendar对象转换为Date对象
                Date date = c.getTime();

                // 创建SimpleDateFormat对象，指定目标格式
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 将日期转换为指定格式的字符串
        String now = sdf.format(date);
        System.out.println("当前时间：" + now);
    }
}