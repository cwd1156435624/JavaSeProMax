package d6_method_reference;

import java.util.Arrays;
import java.util.Comparator;

/*
目标：掌握构造器引用的使用场景以及引用格式
1.使用场景：
    如果某个Lambda表达式里只是在创建对象，并且前后参数情况一致，就可以使用构造器引用。
2.引用格式
    类名::new
 */
public class Demo4 {
    public static void main(String[] args) {
        //1、创建CreateCar接口的匿名内部类对象。
        new CreateCar(){

            @Override
            public Car create(String name, double price) {
                return new Car(name,price);
            }
        };

        Car c1 = new Car("奔驰",600000);
        System.out.println(c1);

        //2、使用Lambda类改进
        CreateCar cc1 = (name,price) -> new Car(name,price);
        Car c2 = cc1.create("宝马",500000);
        System.out.println(c2);

        //3、使用方法引用改进：构造器引用
        CreateCar cc2 = Car::new;
        Car c3 = cc2.create("五菱宏光",10000);
        System.out.println(c3);

    }
}
