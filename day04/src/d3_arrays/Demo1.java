package d3_arrays;

import java.util.Arrays;

/*
目标：掌握Arrays工具类的作用及常用方法
1.Arrays概述：此类包含用来操作数组（比如排序和搜索）的各种方法

2.Arrays类的常用方法
    public static String toString(int[] a)
          返回指定数组内容的字符串表示形式
    public static void sort(int[] a)
          对指定的 int 型数组按数字升序进行排序。
    public static int binarySearch(int[] a, int key)
          使用二分搜索法来搜索指定的 int 型数组，以获得指定的值。
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {50,30,20,40,10};
        //1.把数组转换为字符串
        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        //2.对数组的元素排序（升序）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        //3.查找数组中20元素所在的索引
        int i = Arrays.binarySearch(arr, 50);
        System.out.println(i);
    }
}
