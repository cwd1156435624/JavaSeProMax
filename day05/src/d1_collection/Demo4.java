package d1_collection;

import java.util.ArrayList;
import java.util.Collection;

/*
目标：演示单列集合的通用遍历方式 ———— 增强for遍历
 */
public class Demo4 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("脉劫");
        c1.add("康帅傅");
        c1.add("粤利粤");

        //需求：使用增强for遍历Collection集合中的每一个元素，并打印输出
        for (String s : c1) {
            System.out.println(s);
        }
    }
}
