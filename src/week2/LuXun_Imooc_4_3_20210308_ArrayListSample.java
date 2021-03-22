package week2;

import java.util.ArrayList;
import java.util.List;

/**
 * 4-3 ArrayList列表类的使用
 * author:luxun
 * date:2020-03-08
 * <p>
 * ArrayList类
 * ArrayList是Java内置的数据集合，用于存储多个数据
 * ArrayList是数组替代品，提供了更多的数据操作方法
 * ArrayList几乎是每一个项目中必用的类
 */

public class LuXun_Imooc_4_3_20210308_ArrayListSample {
    public static void main(String[] args) {
        List<String> bookList = new ArrayList<String>();
//        add方法是在数组列表的尾部添加元素
        bookList.add("红楼梦");
        bookList.add("西游记");
        bookList.add("水浒传");
        bookList.add("三国志");

//        指定位置添加元素，index是插入元素的位置
        bookList.add(0, "镜花缘");

        System.out.println(bookList);

        String bookName4 = bookList.get(3);
        System.out.println(bookName4);

//        对数组列表进行遍历1
        for (int i = 0; i < bookList.size(); i++) {
            bookList.get(i);
            System.out.println("第" + (i + 1) + "个元素是： " + bookList.get(i));
        }
//        对数组列表进行遍历2
        for (String book : bookList) {
            System.out.println("《" + book + "》");
        }
//        <String>表示给数组列表限定数据类型，接口和实现类需要一起添加
        List<String> nameList = new ArrayList<String>();
        nameList.add("张三");
        nameList.add("李四");
        nameList.add("王五");

        System.out.println(nameList);

        System.out.println(nameList.size());

        nameList.remove(2);
        System.out.println(nameList);

//        删除最后一个元素
        nameList.remove(nameList.size() - 1);
        System.out.println(nameList);

    }
}
