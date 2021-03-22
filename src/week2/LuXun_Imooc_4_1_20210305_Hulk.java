package week2;

/**
 * 4-1 面向对象特性之继承
 * author:luxun
 * date:2020-03-07
 * extends关键字用于类的继承
 * extends关键字后面是"父类"，extends关键字前是"子类"
 * 子类会继承父类的(default)/protected/public修饰符的成员变量与方法
 * ❎
 * 访问修饰符作用范围总结
 * 修饰词      本类  同一个包的类  继承类 其他类
 * private     ✅      ❎       ❎    ❎
 * 无（默认）    ✅      ✅       ❎    ❎
 * protected   ✅      ✅       ✅    ❎
 * public      ✅      ✅       ✅    ✅
 */

public class LuXun_Imooc_4_1_20210305_Hulk extends LuXun_Imooc_4_1_20210305_Mark1 {
    private void repair() {
        System.out.println("弹射备件替换战损组件");
    }

    public static void main(String[] args) {
        LuXun_Imooc_4_1_20210305_Hulk hulk = new LuXun_Imooc_4_1_20210305_Hulk();
        hulk.color = "红色";
        hulk.movie = "复仇者联盟3";
        hulk.title = "反浩克装甲";
        hulk.description();

        hulk.repair();
    }
}
