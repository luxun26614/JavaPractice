package week2;

/**
 * 3-2 访问修饰符
 * author:luxun
 * date:2020-03-05
 * 访问修饰符用于控制类、成员变量、方法的访问范围
 * 访问修饰符     名称      说明
 * private      私有      只能在类的内部访问
 * public       公共      在任何地方都可以访问
 * (default)    默认      相同包的其他类可以访问
 * protected    继承      只有继承的子类可以访问到
 */

public class LuXun_Imooc_3_2_20210305 {
//    public代表其他任何类都可以访问的成员变量
    public String name;

//    private代表只能在当前类中使用
    private void sayHello(){
        System.out.println("Hello World!");
    }

//    不写访问修饰符代表是默认修饰符，表示只能被包中的其他类访问
    void sayGoodbye(){
        System.out.println("Good bye!");
    }
}