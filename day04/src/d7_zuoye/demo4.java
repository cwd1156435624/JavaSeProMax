package d7_zuoye;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
需求：键盘录入一个未来的日期如：“2023-01-22 00:00:00”，
计算当前时间距离录入的时间有多少小时？多少分钟？多少秒？，类似于一个倒计时的效果
 */
public class demo4 {
    public static void main(String[] args) throws ParseException {
        //键盘录入一个未来的日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个未来的日期:");
        String s = sc.next();

        ////将字符串使用SimpleDateFormat解析为Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date date = sdf.parse(s);
        //计算到未来的毫秒值
        long time = date.getTime();
        //计算现在的毫秒值
        Date date1 = new Date();
        long time1 = date1.getTime();

        //中间的差值
        long sub = time - time1;

        //到现在的天数
        long day = sub /1000/60/60/24;
        //到现在的小时数
        long hour = sub /1000/60/60%24;
        //到现在的分钟数
        long min = sub /1000/60%60;
        //到现在的秒数
        long sec = sub /1000%60;
        //输出
        System.out.println("距离现在还有："+day+"天"+hour+"小时"+min+"分钟"+sec+"秒");
    }
}
