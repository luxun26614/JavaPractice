package week3;

/**
 * 2-4 Java 中 String 类的常用方法 Ⅱ
 * author:luxun
 * date:2020-03-16
 * 那么，“==” 和 equals() 有什么区别呢？
 * <p>
 * ==: 判断两个字符串在内存中首地址是否相同，即判断是否是同一个字符串对象
 * <p>
 * equals(): 比较存储在两个字符串对象中的内容是否一致
 * <p>
 * PS：字节是计算机存储信息的基本单位，1 个字节等于 8 位， gbk 编码中 1 个汉字字符存储需要 2 个字节，1 个英文字符存储需要 1 个字节。
 * 所以我们看到上面的程序运行结果中，每个汉字对应两个字节值，如“学”对应 “-47 -89” ，而英文字母 “J” 对应 “74” 。
 * 同时，我们还发现汉字对应的字节值为负数，原因在于每个字节是 8 位，最大值不能超过 127，而汉字转换为字节后超过 127，如果超过就会溢出，以负数的形式显示。
 * （关于编码，我们在后面课程中会详细介绍，小小期待哦~~）
 * 任务
 * 功能：统计指定字符串中字符 ‘a’ 出现的次数
 * 分析：可以通过循环遍历字符串中的每一个字符，判断是否是字符 a ，如果是，则累加统计出现的次数
 * 运行结果：字符a出现的次数：8
 */
public class LuXun_Imooc_2_4_20210316 {
    public static void main(String[] args) {
        // 定义一个字符串
        String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";

//        System.out.println(s.substring(0, 1));
        // 出现次数
        int num = 0;

        // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
        for (int i = 0; i < s.length() - 1; i++) {
            // 获取每个字符，判断是否是字符a
            if (s.substring(i, i + 1).equals("a")) {
                System.out.println("a出现的位置是：" + (i + 1));
                // 累加统计次数
                num++;
            }
        }
        System.out.println("字符a出现的次数：" + num);
    }
}