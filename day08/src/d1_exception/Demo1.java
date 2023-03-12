package d1_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
目标：认识异常、异常的继承体系
 */
public class Demo1 {
    public static void main(String[] args) throws ParseException {
        /*int number = Integer.parseInt("12345");
        System.out.println(number);*/


        //演示一个运行时异常：打印输出数组中编号是5索引的元素
//        int[] arr = {1,2,3,4};
//        System.out.println(arr[5]);


        //演示一个编译时异常：打印输出"2088年08月08日"的毫秒值
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
            Date date = sdf.parse("2088年08月08日");
            System.out.println(date.getTime());
        } catch (ParseException e) {
            System.out.println("您输入的格式有误");
        }

    }
}
