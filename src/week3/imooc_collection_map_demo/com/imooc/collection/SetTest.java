package week3.imooc_collection_map_demo.com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
    public List<Course> courseToSelect;

    private Scanner console;

    public Student student;

    public SetTest() {
        courseToSelect = new ArrayList<Course>();
        console = new Scanner(System.in);

    }

    public void testAdd() {
        //创建一个课程对象，并通过调用add方法，添加到备选课程List中
        Course cr1 = new Course("1", "数据结构");
        courseToSelect.add(cr1);
        Course temp = (Course) courseToSelect.get(0);
//        System.out.println("添加类课程:" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2", "C语言");
        courseToSelect.add(0, cr2);
        Course temp2 = (Course) courseToSelect.get(0);
//        System.out.println("添加类课程:" + temp2.id + ":" + temp2.name);

        //添加重复元素（列表可添加重复元素）
//        courseToSelect.add(cr1);
//        Course temp0 = (Course) courseToSelect.get(2);
//        System.out.println("添加类课程:" + temp0.id + ":" + temp0.name);

        //一下方法会跑出数组下标越界异常
        Course cr3 = new Course("3", "test");
//        courseToSelect.add(3, cr2);//IndexOutOfBoundsException
//        Course temp3 = (Course) courseToSelect.get(3);//IndexOutOfBoundsException
//        System.out.println("添加类课程:" + temp3.id + ":" + temp3.name);//IndexOutOfBoundsException

        //addAll()，默认在队尾添加元素
        Course[] courses = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        courseToSelect.addAll(Arrays.asList(courses));
        Course temp3 = (Course) courseToSelect.get(2);
        Course temp4 = (Course) courseToSelect.get(3);
//        System.out.println("添加了两门课程：" + temp3.id + "：" + temp3.name + "；" + temp4.id + "：" + temp4.name);

        //addAll(index, element),指定位置添加元素
        Course[] courses2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
        courseToSelect.addAll(2, Arrays.asList(courses2));
        Course temp5 = (Course) courseToSelect.get(2);
        Course temp6 = (Course) courseToSelect.get(3);
//        System.out.println("添加了两门课程：" + temp5.id + "：" + temp5.name + "；" + temp6.id + "：" + temp6.name);
    }

    /**
     * 通过for each遍历列表元素
     *
     * @param
     */
    public void testForEach() {
        System.out.println("有如下课程待选（通过For Each遍历）");
        for (Course cr : courseToSelect) {
            Course temp = (Course) cr;
            System.out.println("课程：" + temp.id + "-" + temp.name);
        }
    }

    /**
     * 测试List的contains方法
     *
     * @param
     */
    public void testListContains() {
        //取得备选课程序列的第0个元素
        Course course = courseToSelect.get(0);
        //打印输入courseToSelct是否包含course对象
        System.out.println("取得课程：" + course.name);
        System.out.println("备选课程中是否包含课程：" + course.name + "," + courseToSelect.contains(course));
        //提示输入课程名称
        System.out.println("请输入课程名称");
        String name = console.next();
        //创建一个新的课程对象，ID和名称，与course对象完全一样
        Course course2 = new Course();
        course2.name = name;
        System.out.println("新创建课程：" + course2.name);
        System.out.println("备选课程中是否包含课程：" + course2.name + "," + courseToSelect.contains(course2));

        //通过indexOf方法来取得某元素的索引位置
        if (courseToSelect.contains((course2)))
            System.out.println("课程：" + course2.name + "的索引位置为：" + courseToSelect.indexOf(course2));
    }

    //创建学生对象并选课
    public void createStudentAndSelectCourse() {
        //创建一个学生对象
        student = new Student("1", "小明");
        System.out.println("欢迎学生：" + student.name + "选课！");
        //创建一个Scanner对象，用来接收从键盘输入的课程ID
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入课程ID");
            String courseId = console.next();
            for (Course cr : courseToSelect) {
                if (cr.id.equals(courseId)) {
                    student.courses.add(cr);
                    /**
                     * Set中，添加某个对象，无论添加多少次，
                     * 最终只会保留一个该对象（的引用）
                     * 并且，保留的是第一次添加的那一个
                     */
                    //Set可以添加null
//                    student.courses.add(null);
//                    student.courses.add(cr);
                }
            }
        }


    }

    /**
     * 测试Set的contains方法
     *
     * @param
     */
    public void testSetContains() {
        //提示输入课程名称
        System.out.println("请输入学生已选的课程名称：");
        //创建一个新的课程对象，ID和名称，与course对象完全一样
        Course course2 = new Course();
        String name = console.next();
        course2.name = name;
        System.out.println("新创建课程：" + course2.name);
        System.out.println("备选课程中是否包含课程：" + course2.name + "," + student.courses.contains(course2));

    }


    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        st.testListContains();
        st.testForEach();

//        st.createStudentAndSelectCourse();
//        st.testSetContains();

//        st.testForEachForSet(student);

    }

    public void testForEachForSet(Student student) {
        //打印输入，学生所选的课程
        System.out.println("共选择了" + student.courses.size() + "门课程");
        for (Course cr : student.courses) {
            System.out.println("选择了课程：" + cr.id + "：" + cr.name);
        }
    }
}


