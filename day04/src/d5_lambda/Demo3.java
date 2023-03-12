package d5_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

/*
目标：使用Lambda表达式的简化格式对匿名内部类进行简化
 */
public class Demo3 {
    public static void main(String[] args) {
        //1.public static void sort(类型[] arr, Comparator<类型> compaator)：对数组进行自定义排序
        //需求1：对students数组中的元素按照年龄升序排列
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 163.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);
        //标准的
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        //lambda表达式
        Arrays.sort(students,(Student o1, Student o2) -> {
            return o1.getAge() - o2.getAge();
        });
        //省略参数
        Arrays.sort(students,(o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });
        //简化的.如果Lambda表达式中的方法体代码只有一行代码，可以省略大括号不写，同时要省略分号！
        // 此时，如果这行代码是return语句，也必须去掉return不写。
        Arrays.sort(students, ( o1,  o2) -> o1.getAge() - o2.getAge());
        System.out.println(Arrays.toString(students));


        //2.public static void setAll(类型[] array, IntToDoubleFunction generator)： 修改数组中的每一个元素
        //需求2：对数组中的每一个元素乘以0.8
        double[] prices = {99.8, 128.0, 100.0};
        //匿名内部类的
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 8;
            }
        });
        //lambda的
        Arrays.setAll(prices, (int value) -> {
                return prices[value] * 8;
        });
        //省略的
        Arrays.setAll(prices, (value) -> {
            return prices[value] * 8;
        });
        //最简的
        Arrays.setAll(prices, (value) -> prices[value] * 8);
        System.out.println(Arrays.toString(prices));
    }
}
