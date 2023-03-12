package d1_stream;

import java.util.ArrayList;
import java.util.List;

/*
目标：分别使用传统方式、Stream API完成下面的需求。体验Stream流的优势
需求：把集合中所有以“张”开头，且是3个字的元素存储到一个新的集合。
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建一个集合，添加若干个元素
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));


    }
}
