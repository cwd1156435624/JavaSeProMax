package d1_date;

import java.util.Date;

/*
目标：Date类构造方法和成员方法演示
需求：请计算出当前时间往后走1小时26分之后的时间是多少？
 */
public class Demo1 {
    public static void main(String[] args) {
        //获取当前时间
        Date date = new Date();
        System.out.println(date);
        //算出现在的毫秒值
        long time = date.getTime();
        System.out.println(time);
        time += 1*60*60*1000 + 26*60*1000;
        date.setTime(time);
        System.out.println(date);

    }
}
