package week3;

/**
 * 3-1 Java 中的 StringBuilder 类的常用方法
 * author:luxun
 * date:2020-03-16
 * 基本数据类型：int、float、double、boolean、char 等。
 * 基本数据类型是不具备对象的特性的，比如基本类型不能调用方法、功能简单。。。，
 * 为了让基本数据类型也具备对象的特性， Java 为每个基本数据类型都提供了一个包装类，这样我们就可以像操作对象那样来操作基本数据类型。
 * 基本类型     对应的包装类
 * byte         Byte
 * short        Short
 * int          Integer
 * long         Long
 * float        Float
 * double       Double
 * char         Character
 * boolean      Boolean
 * 包装类主要提供了两大类方法：
 * 1. 将本类型和其他基本类型进行转换的方法
 * 2. 将字符串和本类型及包装类互相转换的方法
 */
public class LuXun_Imooc_3_1_20210316 {
    public static void main(String[] args) {

        // 定义int类型变量，值为86
        int score1 = 86;
        int score0 = 85;

        // 创建Integer包装类对象，表示变量score1的值
        Integer score2=new Integer(score1);

        // 将Integer包装类转换为double类型
        double score3=score2.doubleValue();

        // 将Integer包装类转换为float类型
        float score4=score2.floatValue();

        // 将Integer包装类转换为int类型
        int score5 =score2.intValue();

        System.out.println("Integer包装类：" + score2);
        System.out.println("double类型：" + score3);
        System.out.println("float类型：" + score4);
        System.out.println("int类型：" + score5);

        byte score6 = score2.byteValue();
        System.out.println("byte类型："+score6);

        System.out.println(score2.compareTo(score1));
        System.out.println(score2.compareTo(score0));
    }
}