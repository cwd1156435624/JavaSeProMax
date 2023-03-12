package d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
目标：演示Collections工具类的常用方法
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //public static <T> boolean addAll(Collection<? super T> c, T...elements) 添加元素
        Collections.addAll(list,"王二狗","李翠花","吴刚","刘瘤子");
        System.out.println(list);

        //public static void shuffle(List<?> list) 打乱元素
        Collections.shuffle(list);
        System.out.println(list);

        //public static <T> void sort(List<T> list) 排序
        Collections.sort(list);
        System.out.println(list);

        //public static <T> void sort(List<T> list, Comparator<? super T> c) 需要比较器排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);
    }
}
