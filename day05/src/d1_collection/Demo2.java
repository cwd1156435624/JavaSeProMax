package d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
目标：演示Collection集合的通用方法。
    由于Collection是所有单列集合的根接口，所以Collection接口的方法，所有单列集合都能够使用
 */
public class Demo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        //public boolean add(E e)  添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //public void clear()  清空集合
        /*list.clear();
        System.out.println(list);*/

        //public boolean remove(E e)  删除指定元素
        /*list.remove("world");
        System.out.println(list);*/

        //public boolean contains(Object obj)  检测集合中是否含有指定元素
        /*boolean b1 =list.contains("world");
        System.out.println(b1);*/


        //public boolean isEmpty() 检测集合是否为空
        /*boolean b2 = list.isEmpty();
        System.out.println(b2);*/

        //public int size()  获得集合的长度
        /*int s = list.size();
        System.out.println(s);*/

        //public Object[] toArray()  把集合中的类型添加到数组中
        Object[] o = list.toArray();
        System.out.println(Arrays.toString(o));
    }
}
