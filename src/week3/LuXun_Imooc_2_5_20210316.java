package week3;

/**
 * 2-5 认识 Java 中的 StringBuilder 类
 * author:luxun
 * date:2020-03-16
 * String 类具有是不可变性。如
 * String str = "Hello";
 * System.out.println(str + "world");
 * System.out.println(str);
 * 从运行结果中我们可以看到，程序运行时会额外创建一个对象，保存 "helloworld"。
 * 当频繁操作字符串时，就会额外产生很多临时变量。使用 StringBuilder 或 StringBuffer 就可以避免这个问题。
 * 至于 StringBuilder 和StringBuffer ，它们基本相似，不同之处，StringBuffer 是线程安全的，而 StringBuilder 则没有实现线程安全功能，所以性能略高。
 * 因此一般情况下，如果需要创建一个内容可变的字符串对象，应优先考虑使用 StringBuilder 类。
 *
 * StringBuilder hobby = new StringBuilder("爱慕课");
 */
public class LuXun_Imooc_2_5_20210316 {
    public static void main(String[] args) {

        // 创建一个StringBuilder对象，用来存储字符串
        StringBuilder hobby = new StringBuilder("爱慕课");

        System.out.println(hobby);

        // 创建空的StringBuilder对象
        StringBuilder sb  = new StringBuilder();
        sb = hobby;
//        sb = "sb"; // String类型数据不能赋给StringBuilder对象
        System.out.println(sb);

    }
}