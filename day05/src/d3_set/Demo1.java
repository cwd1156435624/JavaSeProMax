package d3_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
目标：演示Set集合的特点，运行下面的代码总结HashSet集合、LinkedHashSet集合、TreeSet集合的元素特点
 */
public class Demo1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("i");
        set1.add("t");
        set1.add("h");
        set1.add("m");
        set1.add("m");
        System.out.println("HashSet集合："+set1);

        System.out.println("-------------------------------------");
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("i");
        set2.add("t");
        set2.add("h");
        set2.add("m");
        set2.add("m");
        System.out.println("LinkedHashSet集合："+set2);

        System.out.println("---------------------------------------");

        Set<String> set3 = new TreeSet<>();
        set3.add("c");
        set3.add("b");
        set3.add("d");
        set3.add("a");
        set3.add("a");
        System.out.println("TreeSet集合："+set3);
    }
}
