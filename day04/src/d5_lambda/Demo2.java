package d5_lambda;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

/*
目标: Lambda表达式的作用和格式
1.Lambda表达式的作用：
    Lambda表达式可以简化匿名内部类的书写（前提是仅对函数式接口的匿名内部类）

2.什么是函数式接口：
    - 接口中只能有一个抽象方法的接口
    - 函数式接口一般会被@FuncationalInterface注解标记，可以起到语法检查的作用

3.Lamdba表达式的格式：
    (重写方法的形参)->{
         重写方法的代码
    }
 */
public class Demo2 {
    public static void main(String[] args) {
        //1.创建Swimming接口的匿名内部类对象
        Swimming sw = new Swimming(){

            @Override
            public void swim() {
                System.out.println("打刨秋");
            }
        };

        //2.使用Lambda表达式对Swimming接口的匿名内部类对象进行简化
        Swimming sw1 = () -> {
                System.out.println("打刨秋");
            };


        System.out.println("----------------------");

        //3.对Demo1案例中的代码，使用Lambda表达式进行简化
        //1.public static void sort(类型[] arr, Comparator<类型> compaator)：对数组进行自定义排序
        //需求1：对students数组中的元素按照年龄升序排列
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 163.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);
        Arrays.sort(students,(Student o1, Student o2) -> {
            return o1.getAge() - o2.getAge();
        });
        System.out.println(Arrays.toString(students));


        //2.public static void setAll(类型[] array, IntToDoubleFunction generator)： 修改数组中的每一个元素
        //需求2：对数组中的每一个元素乘以0.8
        double[] prices = {99.8, 128.0, 100.0};
        Arrays.setAll(prices, (int value) -> {
                return prices[value] * 8;
            });
        System.out.println(Arrays.toString(prices));
    }
}
