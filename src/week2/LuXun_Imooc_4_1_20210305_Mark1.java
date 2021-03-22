package week2;

/**
 * 4-1 面向对象特性之继承
 * author:luxun
 * date:2020-03-07
 */

public class LuXun_Imooc_4_1_20210305_Mark1 {
    protected String title;
    protected String color;
    protected String movie;

    public void description() {
        System.out.println("型号：" + title);
        System.out.println("颜色：" + color);
        System.out.println("首次出现电影：" + movie);
    }

    private void fire() {
        System.out.println("利用手臂燃料泵射出火焰");
    }

    public static void main(String[] args) {
        LuXun_Imooc_4_1_20210305_Mark1 lim1 = new LuXun_Imooc_4_1_20210305_Mark1();
        lim1.color = "银灰色";
        lim1.movie = "钢铁侠1";
        lim1.title = "马克1型";
        lim1.description();
        lim1.fire();
    }
}
