package d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
需求：请计算出 “2022年01月20日11点11分11秒”，往后走2天14小时后的时间是多少？
分析思路：
    1.“22022年01月20日11点11分11秒”       Date对象
    2.Date对象获取毫秒值
    3.将毫秒值 +  2天14小时（需要转换为毫秒值），得到新的毫秒值
    4.再将新的毫秒值设置给Date对象
    5.再将Date对象格式化为指定格式的字符串
 */
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        //“22022年01月20日11点11分11秒”       Date对象
        String str = "2022年01月20日 11点11分11秒";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
        //2.Date对象获取毫秒值
        Date date = sdf.parse(str);
        long time = date.getTime();
        //将毫秒值 +  2天14小时（需要转换为毫秒值），得到新的毫秒值
        time += 2*24*60*60*1000 + 14*60*60*1000;
        //再将新的毫秒值设置给Date对象
        date.setTime(time);
        //再将Date对象格式化为指定格式的字符串
        String str1 = sdf.format(date);
        System.out.println(str1);

    }
}
