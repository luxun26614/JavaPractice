package week3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 3-5 使用 Date 和 SimpleDateFormat 类表示时间
 * author:luxun
 * date:2020-03-16
 * 使用 Date 类的默认无参构造方法创建出的对象就代表当前时间，我们可以直接输出 Date 对象显示当前的时间
 * CST 代表 China Standard Time (中国标准时间，也就是北京时间，东八区)
 * 可以使用 java.text 包中的 SimpleDateFormat 来对日期时间进行格式化，如可以将日期转换为指定格式的文本，也可将文本转换为日期。
 * 1. 使用 format() 方法将日期转换为指定格式的文本
 * 2. 使用 parse() 方法将文本转换为日期
 * <p>
 * 注意：
 * 1、 调用 SimpleDateFormat 对象的 parse() 方法时可能会出现转换异常，即 ParseException ，因此需要进行异常处理
 * 2、 使用 Date 类时需要导入 java.util 包，使用 SimpleDateFormat 时需要导入 java.text 包
 * <p>
 * 功能：实现将日期转换为指定格式的文本，将文本转换为日期
 * 运行结果：
 * 2021年03月16日 11时41分02秒
 * 2021/03/16 11:41
 * 2021-03-16 11:41:02
 * Sun Jun 01 21:05:36 CST 2014
 */
public class LuXun_Imooc_3_5_20210316 {
    public static void main(String[] args) {

        // 使用format()方法将日期转换为指定格式的文本
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 创建Date对象，表示当前时间
        Date now = new Date();

        // 调用format()方法，将日期转换为字符串并输出
        System.out.println(sdf1.format(now));
        System.out.println(sdf2.format(now));
        System.out.println(sdf3.format(now));

        // 使用parse()方法将文本转换为日期
        String d = "2014-6-1 21:05:36";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 调用parse()方法，将字符串转换为日期
        try {
            Date date = sdf.parse(d);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}