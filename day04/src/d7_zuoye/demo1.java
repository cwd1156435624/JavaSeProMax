package d7_zuoye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    需求 :  键盘录入字符串 "10 20 50 30 40" ，录入字符串用nextLine()方法。中间用空格隔开
            - 查找String类的API找到split方法，使用该方法按照空格对字符串进行切割，得到一个字符串数组
            - 遍历数组，把字符串数组中的每一个元素转换为int类型
            - 再使用Arrays对int类型数组元素进行升序排列。
 */
public class demo1 {
    public static void main(String[] args) {
        //键盘录入字符串 "10 20 50 30 40"
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组:");
        String s = sc.nextLine();
        //查找String类的API找到split方法，使用该方法按照空格对字符串进行切割，
        String[] ss = s.split(" ");
        //定义一个数组用来接收遍历出来的元素
        int[] arr = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            //遍历数组，把字符串数组中的每一个元素转换为int类型
            int num = Integer.parseInt(ss[i]);
            arr[i] = num;
        }
        //再使用Arrays对int类型数组元素进行升序排列。
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
