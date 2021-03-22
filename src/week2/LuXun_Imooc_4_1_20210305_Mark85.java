package week2;

/**
 * 4-1 面向对象特性之继承
 * author:luxun
 * date:2020-03-07
 */

public class LuXun_Imooc_4_1_20210305_Mark85 extends LuXun_Imooc_4_1_20210305_Mark1 {
    private void createShield() {
        System.out.println("利用纳米技术生成防御护盾");
    }

    public static void main(String[] args) {
        LuXun_Imooc_4_1_20210305_Mark85 lim85 = new LuXun_Imooc_4_1_20210305_Mark85();
        lim85.color = "马克85型";
        lim85.movie = "红色";
        lim85.title = "复仇者联盟4";
        lim85.description();

        lim85.createShield();
    }
}
