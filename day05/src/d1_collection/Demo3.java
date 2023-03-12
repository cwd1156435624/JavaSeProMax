package d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
目标：演示单列集合的通用遍历方式 ———— 迭代器遍历
 */
public class Demo3 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("脉劫");
        c1.add("康帅傅");
        c1.add("粤利粤");

        //需求：使用迭代器遍历Collection集合中的每一个元素，并打印输出
        Iterator<String> it = c1.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
