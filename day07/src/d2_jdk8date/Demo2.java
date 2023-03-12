package d2_jdk8date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
目标：掌握日期格式器DateTimeFormatter的使用
 */
public class Demo2 {
    public static void main(String[] args) {
        // 1、创建一个DateTimeFormatter格式化器对象，指定格式为"yyyy年MM月dd日 HH:mm:ss"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        // 2、对时间进行格式化
        LocalDateTime localDateTime = LocalDateTime.now();
        String str =localDateTime.format(dtf);
        System.out.println(str);

        // 3、解析时间：将"2029年12月12日 12:12:11"解析为LocalDateTime对象
        LocalDateTime localDateTime1 = LocalDateTime.parse("2029年12月12日 12:12:12",dtf);
        System.out.println(localDateTime1);

    }
}
