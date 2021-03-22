package week3.imooc_collection_map_demo.com.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 将要完成：
 * 1。通过Collections.sort()方法，对Integer泛型的List进行排序；
 * 2。对String泛型对List进行排序；
 * 3。对其他类型泛型对List进行排序，以Student为例。
 */
public class CollectionsTest {
    /**
     * 1。通过Collections.sort()方法，对Integer泛型的List进行排序；
     */
    public void testSort1() {
        List<Integer> integerList = new ArrayList<Integer>();
        //插入十个100以内的不重复随机整数
        Random random = new Random();
        Integer k;
        for (int i = 0; i < 10; i++) {
            do {
                k = random.nextInt(100);

            } while (integerList.contains(k));
            integerList.add(k);
            System.out.println("成功添加整数：" + k);
        }
        System.out.println("-------排序前-------");
        for (Integer integer :
                integerList) {
            System.out.println("元素：" + integer);
        }
        Collections.sort(integerList);
        System.out.println("-------排序后-------");
        for (Integer integer :
                integerList) {
            System.out.println("元素：" + integer);
        }
    }

    /**
     * 2。对String泛型对List进行排序；
     * 创建String泛型的List，添加三个乱序的String元素，
     * 调用sort方法，再次输出排序后的顺序
     * <p>
     * 排列顺序：
     * 数字：0-9
     * 大写字母：A-Z
     * 小写字母：a-z
     */
    public void testSort2() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("g");
        stringList.add("b");
        stringList.add("c");
        System.out.println("---------排序前-----------");
        for (String string :
                stringList) {
            System.out.println("元素：" + string);
        }

        System.out.println("---------排序后-----------");
        Collections.sort(stringList);
        for (String string :
                stringList) {
            System.out.println("元素：" + string);
        }

    }

    /**
     * 利用Collections.sort()方法对泛型为String的List进行排序版本2：
     * 1.创建完List<String>之后，往其中添加十条随机字符串
     * 2.每条字符串长度为10以内的随机整数
     * 3.每条字符串的每个字符都为随机生成的字符，字符可以重复
     * 4.每条随机字符串不可重复
     */
    public void testSort3() {
        List<String> stringList = new ArrayList<String>();

        Random random = new Random();

        //随机字符共62个（a-z，A-Z，0-9）
        String sb = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";

        for (int x = 0; x < 10; x++) {
            //生成随机长度
            int length = random.nextInt(10);
            StringBuilder sb1 = new StringBuilder();
            int i = 0;
            while (i < length) {
                //生成随机位置
                int index = random.nextInt(62);
                //产生一个随机字符
                for (int j = 0; j < sb.length(); j++) {
                    if (j == index) {
//                        System.out.println("字符是： "+sb.charAt(j));
                        sb1.append(sb.charAt(index));
                    }
                }
                i++;
            }
            System.out.println("生成的随机字符串是： " + sb1);


            stringList.add(String.valueOf(sb1));
        }

        System.out.println("生成以下字符串10组：" + stringList);

        Collections.sort(stringList);

        System.out.println("排序后，10组字符串为：" + stringList);
    }

    /**
     * 3。对其他类型泛型对List进行排序，以Student为例。
     */
    public void testSort4() {
        List<Student> studentList = new ArrayList<Student>();
        Random random = new Random();
//        studentList.add(new Student(random.nextInt(1000) + "", "xiaoming"));
//        studentList.add(new Student(random.nextInt(1000) + "", "xiaomao"));
//        studentList.add(new Student(random.nextInt(1000) + "", "xiaowang"));
//        studentList.add(new Student(100000+ "", "BeyondTeam"));

        List<Integer> integerList = new ArrayList<Integer>();
        int k = 0;

        if (!integerList.contains(k)) {
            for (int i = 0; i < 3; i++) {
                k = random.nextInt(1000);
                integerList.add(k);
            }
        }


        for (Integer integer1 : integerList) {
            studentList.add(new Student(integer1 + "", "xiao" + integer1));
        }


        System.out.println("----------排序前--------");
        for (Student student :
                studentList) {
            System.out.println("学生id：" + student.id + "， 学生姓名：" + student.name);
        }
        System.out.println("----------排序后--------");
        Collections.sort(studentList);
        for (Student student :
                studentList) {
            System.out.println("学生id：" + student.id + "， 学生姓名：" + student.name);
        }
        System.out.println("-------按照姓名排序后---------");
        Collections.sort(studentList, new StudentComparator());
        for (Student student :
                studentList) {
            System.out.println("学生id：" + student.id + "， 学生姓名：" + student.name);
        }
    }


    public static void main(String[] args) {
        CollectionsTest ct = new CollectionsTest();
//        ct.testSort1();

//        ct.testSort2();

//        ct.testSort3();

        ct.testSort4();
    }

}
