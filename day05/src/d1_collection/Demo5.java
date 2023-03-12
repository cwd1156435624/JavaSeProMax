package d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/*
目标：演示单列集合的通用遍历方式 ———— Lambda表达式遍历
 */
public class Demo5 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("脉劫");
        c1.add("康帅傅");
        c1.add("粤利粤");

        //需求：使用forEach方法，传递Lambda表达式遍历Collection集合中的每一个元素，并打印输出
        c1.forEach(s -> System.out.println(s));
    }
}
