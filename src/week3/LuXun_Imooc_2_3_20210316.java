package week3;

/**
 * 2-3 Java 中 String 类的常用方法 Ⅰ
 * author:luxun
 * date:2020-03-16
 * <p>
 * 功能：判断 Java 文件名是否正确，判断邮箱格式是否正确。其中：合法的文件名应该以 .java 结尾；合法的邮箱名中至少要包含 “@” , 并要求 “@” 在 “.” 之前
 * 请参考注释，在编辑器中的第 16、19、22、36 行中将代码填写完整
 * 运行结果：
 * Java文件名正确
 * 邮箱格式正确
 */
public class LuXun_Imooc_2_3_20210316 {
    public static void main(String[] args) {
        // Java文件名
        String fileName = "HelloWorld.java";
        // 邮箱
        String email = "laurenyang@imooc.com";

        // 判断.java文件名是否正确：合法的文件名应该以.java结尾
        /*
        参考步骤：
        1、获取文件名中最后一次出现"."号的位置
        2、根据"."号的位置，获取文件的后缀
        3、判断"."号位置及文件后缀名
        */
        //获取文件名中最后一次出现"."号的位置
        int index = fileName.indexOf(".");
        System.out.println("index: " + index);
        // 获取文件的后缀
        String prefix = fileName.substring(11, 15);
        System.out.println("prefix: " + prefix);

        // 判断必须包含"."号，且不能出现在首位，同时后缀名为"java"
        if (index != -1 && prefix.equals("java")) {
            System.out.println("Java文件名正确");
        } else {
            System.out.println("Java文件名无效");
        }

        // 判断邮箱格式是否正确：合法的邮箱名中至少要包含"@", 并且"@"是在"."之前
         /*
        参考步骤：
        1、获取文件名中"@"符号的位置
        2、获取邮箱中"."号的位置
        3、判断必须包含"@"符号，且"@"必须在"."之前
        */
        // 获取邮箱中"@"符号的位置
        int index2 = email.indexOf("@");

        // 获取邮箱中"."号的位置
        int index3 = email.indexOf('.');

        // 判断必须包含"@"符号，且"@"必须在"."之前
        if (index2 != -1 && index3 > index2) {
            System.out.println("邮箱格式正确");
        } else {
            System.out.println("邮箱格式无效");
        }
    }
}