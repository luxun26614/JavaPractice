package week1;

/**
 * 4-6 Java条件语句之switch
 * date：2021-03-02
 * author：luxun
 * ***************
 * 任务
 * 快来制作属于你的菜谱吧！
 *
 * 请在代码编辑器中，使用 switch 语句补全代码，设置属于你的菜谱：如果今天是星期一、三、五，则早餐吃包子，如果是星期二、四、六，则早餐吃油条，如果是星期日，则吃“主席套餐”
 *
 * 运行结果为： 吃主席套餐
 */

public class LuXun_Imooc_4_6_20210302 {
    public static void main(String[] args) {
        char today = '日';

        switch (today) {
            case '一':
                System.out.println("吃包子");
                break;
            case '二':
                System.out.println("吃油条");
                break;
            case '三':
                System.out.println("吃包子");
                break;
            case '四':
                System.out.println("吃油条");
                break;
            case '五':
                System.out.println("吃包子");
                break;
            case '六':
                System.out.println("吃油条");
                break;
            case '日':
                System.out.println("吃主席套餐");
                break;
            default:
                System.out.println("输入有误");
        }

    }
}
