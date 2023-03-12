package d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
目标：SimpleDateFormat对象日期的格式化和解析

常见日期格式：
    yyyy年MM月dd日 HH时mm分ss秒
    yyyy-MM-dd HH:mm:ss

常用方法：
    public String format(Date date)
        将Date对象转换为指定格式的日期字符串
    public Date parse(String dateStr)
        将指定日期格式的字符串转换为Date对象
 */
public class Demo1 {
    public static void main(String[] args) throws ParseException {
        //1.先创建SimpleDateFormat对象，并指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //2.格式化：将Date对象转换为指定格式的日期字符串
        String dateStr = sdf.format(new Date());
        System.out.println(dateStr);

        //3.解析：将指定格式的字符串解析为Date对象
        String dateStr1 = "2022-12-03 18:00:00";
        Date date = sdf.parse("2023-11-11 20:20:20");
        System.out.println(date);

    }
}
