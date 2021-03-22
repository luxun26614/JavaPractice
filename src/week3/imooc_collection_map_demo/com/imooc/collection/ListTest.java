package week3.imooc_collection_map_demo.com.imooc.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 用于存放备选课程的List
 *
 * @author luxun
 * 列表可添加重复元素
 */

public class ListTest {

    public List courseToSelect;

    public ListTest() {
        this.courseToSelect = new ArrayList();
    }

    /**
     * 用于往coursesToSelect中添加备选课程
     */
    public void testAdd() {
        //创建一个课程对象，并通过调用add方法，添加到备选课程List中
        Course cr1 = new Course("1", "数据结构");
        courseToSelect.add(cr1);
        Course temp = (Course) courseToSelect.get(0);
        System.out.println("添加类课程:" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2", "C语言");
        courseToSelect.add(0, cr2);
        Course temp2 = (Course) courseToSelect.get(0);
        System.out.println("添加类课程:" + temp2.id + ":" + temp2.name);

        //添加重复元素（列表可添加重复元素）
        courseToSelect.add(cr1);
        Course temp0 = (Course) courseToSelect.get(2);
        System.out.println("添加类课程:" + temp0.id + ":" + temp0.name);

        //一下方法会跑出数组下标越界异常
        Course cr3 = new Course("3", "test");
//        courseToSelect.add(3, cr2);//IndexOutOfBoundsException
//        Course temp3 = (Course) courseToSelect.get(3);//IndexOutOfBoundsException
//        System.out.println("添加类课程:" + temp3.id + ":" + temp3.name);//IndexOutOfBoundsException

        //addAll()，默认在队尾添加元素
        Course[] courses = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        courseToSelect.addAll(Arrays.asList(courses));
        Course temp3 = (Course) courseToSelect.get(3);
        Course temp4 = (Course) courseToSelect.get(4);
        System.out.println("添加了两门课程：" + temp3.id + "：" + temp3.name + "；" + temp4.id + "：" + temp4.name);

        //addAll(index, element),指定位置添加元素
        Course[] courses2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
        courseToSelect.addAll(2, Arrays.asList(courses2));
        Course temp5 = (Course) courseToSelect.get(2);
        Course temp6 = (Course) courseToSelect.get(3);
        System.out.println("添加了两门课程：" + temp5.id + "：" + temp5.name + "；" + temp6.id + "：" + temp6.name);
    }

    /**
     * 取得List中元素的方法（遍历）
     */
    public void testGet() {
        int size = courseToSelect.size();
        System.out.println("有如下课程待选（通过for循环遍历）");
        for (int i = 0; i < size; i++) {
            Course temp = (Course) courseToSelect.get(i);
            System.out.println("课程：" + temp.id + "-" + temp.name);
        }
    }

    /**
     * 通过迭代器遍历列表元素
     * @param
     */
    public void testIterator(){
        Iterator it = courseToSelect.iterator();
        System.out.println("有如下课程待选（通过迭代器访问）");
        while(it.hasNext()){
            Course temp = (Course) it.next();
            System.out.println("课程：" + temp.id + "-" + temp.name);
        }
    }

    /**
     * 通过for each遍历列表元素
     * @param
     */
    public void testForEach(){
        System.out.println("有如下课程待选（通过For Each遍历）");
        for (Object obj :
                courseToSelect) {
            Course temp = (Course)obj;
            System.out.println("课程：" + temp.id + "-" + temp.name);
        }
    }

    /**
     * 修改List中的元素
     * @param
     */
    public void testModify(){
        courseToSelect.set(4,new Course("7","毛概"));
    }

    /**
     * 删除List中的元素
     * @param
     */
    public void testRemove(){
//        Course temp = (Course)courseToSelect.get(4);
//        System.out.println("我是课程："+temp.id + ":"+temp.name+",我即将被删除");
//        courseToSelect.remove(temp);
        System.out.println("即将删除4和5位置上的课程");
        Course[] courses = {(Course) courseToSelect.get(4), (Course) courseToSelect.get(5)};
        courseToSelect.removeAll(Arrays.asList(courses));
//        courseToSelect.remove(4);
        System.out.println("成功删除课程！");
    }

    /**
     * 往List中添加一些奇怪的东西
     * @param args
     */

    public void testType(){
        System.out.println("能否往List中添加一些奇怪的东西呢？");
        courseToSelect.add("我不是课程，我只是一个无辜的字符串。");
    }
    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testType();
        lt.testForEach();
//        lt.testGet();
//        lt.testIterator();
//        lt.testForEach();
//        lt.testModify();
//        lt.testForEach();
//        lt.testRemove();
//        lt.testForEach();
    }
}
