package d4_zuoye;

import java.util.ArrayList;
import java.util.Iterator;

/*
    - 需求 :  往ArrayList添加以下元素”abc1”, ”abc2”, ”abc3”, ”abc4”.使用迭代器获取ArrayList集合中的元素
    - 使用 4 种遍历方式,  对集合进行遍历
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------");

        //增强for遍历
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------");

        //迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-------------");

        //forEach遍历
        list.forEach(s -> System.out.println(s));
    }
}
