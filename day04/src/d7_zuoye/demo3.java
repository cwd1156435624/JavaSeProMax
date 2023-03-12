package d7_zuoye;

/*
使用Date类和SimpleDateFormat完成下面需求

- 键盘录入你的生日字符串 （如：”1998年08月08日“）
- 将生日字符串使用SimpleDateFormat解析为Date对象
- 计算当前日期距离生日那天有多少天？
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class demo3 {
    public static void main(String[] args) throws ParseException {
        //键盘录入你的生日字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日：");
        String s = sc.next();
        //将生日字符串使用SimpleDateFormat解析为Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(s);
        long time1 = date1.getTime();
        //现在日期的毫秒值
        Date date2 = new Date();
        long time2 = date2.getTime();
        //距离现在的天数
        long num = (time2-time1) / 1000/60/60/24;
        System.out.println("您活了"+num+"天");

    }
}
