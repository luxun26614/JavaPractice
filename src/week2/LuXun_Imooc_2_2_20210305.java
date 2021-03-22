package week2;

/**
 * 2-2 IDEA创建类与对象
 * 2-3 成员变量
 * author:luxun
 * date:2020-03-05
 * 成员变量就是隶属于对象的变量
 * 成员变量用于保存对象的静态特征
 * 同类型的不同对象拥有相同的成员变量，但值彼此独立
 */

public class LuXun_Imooc_2_2_20210305 {
    String name;
    int age;
    float weight;

    public static void main(String[] args) {
        LuXun_Imooc_2_2_20210305 duoduo = new LuXun_Imooc_2_2_20210305();
        LuXun_Imooc_2_2_20210305 lucky = new LuXun_Imooc_2_2_20210305();

        duoduo.name = "多多";
        duoduo.age = 6;
        duoduo.weight = 13.5f;

        lucky.name = "Lucky";
        lucky.age = 3;
        lucky.weight = 10.2f;

        System.out.println(duoduo.name + "今天" + duoduo.age + "岁了");
        System.out.println(lucky.name + "体重" + lucky.weight + "千克");
    }
}

//文件名需要为Dog.java
//public class Dog {
//    String name;
//    int age;
//    float weight;
//
//    public static void main(String[] args) {
//        Dog duoduo = new Dog();
//        Dog lucky = new Dog();
//
//        duoduo.name = "多多";
//        duoduo.age = 6;
//        duoduo.weight = 13.5f;
//
//        lucky.name = "Lucky";
//        lucky.age = 3;
//        lucky.weight = 10.2f;
//
//        System.out.println(duoduo.name + "今天" + duoduo.age + "岁了");
//        System.out.println(lucky.name + "体重" + lucky.weight + "千克");
//    }
//}