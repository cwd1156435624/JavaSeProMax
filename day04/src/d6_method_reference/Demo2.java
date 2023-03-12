package d6_method_reference;

import d5_lambda.Student;

import java.util.Arrays;
import java.util.Comparator;

/*
目标：掌握实例方法引用的使用场景以及引用格式
1.使用场景：
   如果某个Lambda表达式里只是调用一个实例方法，并且前后参数的形式一致，就可以使用实例方法引用
2.引用格式
    对象::方法名
 */
public class Demo2 {
    public static void main(String[] args) {
        //1.public static void sort(类型[] arr, Comparator<类型> compaator)：对数组进行自定义排序
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 163.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);

        //2.使用Lambda表达式对students数组中的学生按照身高的升序排列
        //要求：调用CompareByData类的compareByHeight方法
        CompareByData cbd= new CompareByData();
        Arrays.sort(students, (o1, o2) -> cbd.compareByHeight(o1,o2));

        //3.将2步骤的Lambda改成方法引用
        Arrays.sort(students,cbd::compareByHeight);
        System.out.println(Arrays.toString(students));
    }
}
