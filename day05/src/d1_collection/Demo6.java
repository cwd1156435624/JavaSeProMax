package d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
集合综合案例：定义一个集合，往集合中添加3部电影对象，再遍历集合输出每一部电影的属性信息
            每一部电影的属性有：电影名称、评分、主演
 */
public class Demo6 {
    public static void main(String[] args) {
        Collection<movie> list = new ArrayList<>();
        list.add(new movie("功夫熊猫",9.3,"不知道"));
        list.add(new movie("九九九",9.4,"阿达"));
        list.add(new movie("阿斯顿",9.7,"芜湖"));

        Iterator<movie> ite = list.iterator();
        while (ite.hasNext()){
            movie s = ite.next();
            System.out.println(s);
        }

        //需求：使用forEach方法，传递Lambda表达式遍历Collection集合中的每一个元素，并打印输出
        list.forEach(movie -> System.out.println(movie));


    }
}
