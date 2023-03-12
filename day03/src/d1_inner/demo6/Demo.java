package d1_inner.demo6;


import java.util.ArrayList;
import java.util.function.Consumer;

/*
目标：掌握ArrayList类的forEach方法的调用
 */
public class Demo {
    public static void main(String[] args) {
        //准备好一个ArrayList集合，方便后面使用
        ArrayList<String> list = new ArrayList<>();
        list.add("大雄");
        list.add("静香");
        list.add("胖虎");
        list.add("小夫");

        //1.调用forEach方法，观察参数是什么类型，传递对应的匿名内部类对象。
        /*
        底层原理：forEach方法底层会遍历ArrayList集合中的每一个元素，然后把元素交给Consumer接口的accept方法处理。
                但是accept方法是一个抽象方法，所以真正处理元素的是接口的实现类对象.
         */
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
