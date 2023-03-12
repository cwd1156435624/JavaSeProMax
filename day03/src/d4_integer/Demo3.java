package d4_integer;

import java.util.ArrayList;
import java.util.Arrays;

/*
目标：理解包装类自动装箱和自动拆箱的什么意思
 */
public class Demo3 {
    public static void main(String[] args) {
        //1.自动装箱
        Integer i1 = 10;
        //2.自动拆箱
        int i2 = i1 + 20;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(10));
        list.add(10);
        System.out.println(list);
    }
}
