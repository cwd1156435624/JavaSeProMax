package d5_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

/*
目标：使用Arrays的自定义排序方法
   public static void sort(类型[] arr, Comparator<类型> compaator)
        对数组进行自定义排序
   public static void setAll(double[] array, IntToDoubleFunction generator)
        修改数组中的每一个元素
 */
public class Demo1 {
    public static void main(String[] args) {
        //1.public static void sort(类型[] arr, Comparator<类型> compaator)：对数组进行自定义排序
        //需求1：对students数组中的元素按照年龄升序排列
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 163.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);

        /*
        原理:Arrays的sort方法底层会遍历数组中的每一个元素，然后按照某种排序的规则，将两个元素两两比较
            底层就是使用的Comparator接口的compare进行比较的，但是底层的代码中并没有对Comparator接口的方法进行实现。
            由sort方法的调用者来实现。
            那么底层事怎么区分谁大谁小呢？
                Comparator接口规定：
                    如果compare方法的返回值正数，就说明o1比o2大
                    如果compare方法的返回值负数，就说明o1比o2小
                    如果compare方法的返回值为零，就说明o1和o2相等
         */
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(Arrays.toString(students));


        //2.public static void setAll(类型[] array, IntToDoubleFunction generator)： 修改数组中的每一个元素
        //需求2：对数组中的每一个元素乘以0.8
        double[] prices = {99.8, 128.0, 100.0};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));

    }
}
