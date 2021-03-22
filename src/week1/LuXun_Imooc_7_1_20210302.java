package week1;

import java.util.Scanner;

/**
 * 7-1 编程练习
 * date：2021-03-02
 * author：luxun
 * ***************
 * 要求：
 *
 * 利用数组和输入的周数，完成输出：
 *
 * 输出本月（4周）的学习任务，并标记出本周的
 *
 * 运行效果：
 * 您要开始第几周学习啦,直接输入数字吧:12
 * 第3个月
 * 第4周
 * 以下是您本月的学习计划, √ 代表当周学习任务
 * =======================================
 *  	【第9周】前端基础之JavaScript与综合案例
 *  	【第10周】Java Web基础
 *  	【第11周】Java Web基础
 * ✅	【第12周】常用功能与过滤器
 */

public class LuXun_Imooc_7_1_20210302 {
    public static void main(String[] args) {
        //创建String数组，并为每一个元素赋值。赋值内容为第几周+学习内容
        String[] contentList = new String[35];
        contentList[0] = "【第1周】环境搭建与语法入门";
        contentList[1] = "【第2周】Java语法之循环、数组与方法";
        contentList[2] = "【第3周】面向对象之封装与继承";
        contentList[3] = "【第4周】面向对象之单例模式与多态";
        contentList[4] = "【第5周】常用工具类（上）";
        contentList[5] = "【第6周】常用工具类（下）";
        contentList[6] = "【第7周】常用工具类（下）";
        contentList[7] = "【第8周】前端基础之HTML与CSS";
        contentList[8] = "【第9周】前端基础之JavaScript与综合案例";
        contentList[9] = "【第10周】Java Web基础";
        contentList[10] = "【第11周】Java Web基础";
        contentList[11] = "【第12周】常用功能与过滤器";
        contentList[12] = "【第13周】监听器与项目实战";
        contentList[13] = "【第14周】监听器与项目实战";
        contentList[14] = "【第15周】MySQL基础";
        contentList[15] = "【第16周】MySQL基础";
        contentList[16] = "【第17周】Java数据库开发基础";
        contentList[17] = "【第18周】框架前置知识";
        contentList[18] = "【第19周】MyBatis基础";
        contentList[19] = "【第20周】MyBatis实现OA系统项目实战";
        contentList[20] = "【第21周】MyBatis实现OA系统项目实战";
        contentList[21] = "【第22周】Linux环境搭建与Redis应用";
        contentList[22] = "【第23周】Spring基础";
        contentList[23] = "【第24周】Spring基础";
        contentList[24] = "【第25周】Spring基础";
        contentList[25] = "【第26周】SSM开发社交网站";
        contentList[26] = "【第27周】Spring Boot电商项目实战";
        contentList[27] = "【第28周】Spring Boot电商项目实战";
        contentList[28] = "【第29周】面试";
        contentList[29] = "【第30周】多线程与分布式";
        contentList[30] = "【第31周】多线程与分布式";
        contentList[31] = "【第32周】Spring Cloud基础";
        contentList[32] = "【第33周】Spring Cloud电商实战";
        contentList[33] = "【第34周】Spring Cloud电商实战";
        contentList[34] = "【第35周】Zookeeper+Dubbo应用与面试";

        //提示信息
        System.out.print("您要开始第几周学习啦,直接输入数字吧:");
        //设置变量存储接收到的数据
        int week = new Scanner(System.in).nextInt();

        //计算今天是几月(1-月第一周、4-月第4周)
        int perMonth = 0;

        if (week % 4 == 0) {
            perMonth = week / 4;
            System.out.println("第" + perMonth + "个月");
        } else {
            perMonth = week / 4 + 1;
            System.out.println("第" + perMonth + "个月");
        }

        //计算输入的周是这个月的第几周
        int perWeek = week % 4;
        if (perWeek == 0) {
            System.out.println("第4周");
        } else {
            System.out.println("第" + perWeek + "周");
        }

        //提示信息
        System.out.println("以下是您本月的学习计划, √ 代表当周学习任务");
        System.out.println("=======================================");

        //利用for循环，找到数组中对应这个月的内容输出
        for (int i = (perMonth - 1) * 4; i < perMonth * 4; i++) {
            if (i == week - 1) {
                //根据当前月第几周，在输出此行时，前面添加“√”
                System.out.println("✅\t" + contentList[i]);
            } else {
                System.out.println(" \t" + contentList[i]);
            }
        }

    }
}
