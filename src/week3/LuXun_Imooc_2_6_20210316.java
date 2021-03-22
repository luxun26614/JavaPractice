package week3;

/**
 * 2-6 Java 中的 StringBuilder 类的常用方法
 * author:luxun
 * date:2020-03-16
 * StringBuilder 类提供了很多方法来操作字符串：
 * StringBuilder append(参数)        追加内容到当前StringBuilder对象的末尾
 * StringBuilder insert(位置, 参数)   将追加内容插入当前StringBuilder对象的指定位置
 * String toString()                将当前StringBuilder对象转化成String对象
 * int length()                     获取字符串的长度
 * <p>
 * 功能：将一个由英文字母组成的字符串转换成指定格式---从右边开始每三个字母用逗号分隔的形式。
 * 运行效果： j,aew,kjl,dfx,mop,zdm
 */
public class LuXun_Imooc_2_6_20210316 {
    public static void main(String[] args) {
        // 创建一个空的StringBuilder对象
        StringBuilder str = new StringBuilder();

        // 追加字符串
        str.append("jaewkjldfxmopzdm");

        // 从后往前每隔三位插入逗号
        // 要把起始位置去掉，然后设置步长=3
        for (int i = str.length()-3;i>0;i=i-3){
            str.insert(i,",");

        }

        // 将StringBuilder对象转换为String对象并输出
        System.out.print(str.toString());
    }
}