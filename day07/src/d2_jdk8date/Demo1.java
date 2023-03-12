package d2_jdk8date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

/*
目标：JDK8日期类LocalDateTime、LocalDate、LocalTime常用方法
 */
public class Demo1 {
    public static void main(String[] args) {
        // 0、获取本地日期和时间对象。
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // 1、可以获取日期和时间的全部信息（年、月、日、时、分、秒、年中的天、星期几）
        int year = localDateTime.getYear();
        int Month = localDateTime.getMonthValue();
        int day1 = localDateTime.getDayOfMonth();
        int hour = localDateTime.getHour();
        int min = localDateTime.getMinute();
        int sceond = localDateTime.getSecond();
        int day2 = localDateTime.getDayOfYear();
        String week = localDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA);
        System.out.println("今天是"+year+"年"+Month+"月"+day1+"日"+hour+"点"+min+"分"+sceond+"秒,是今年的"+day2+"天");
        System.out.println("今天是"+week);

        // 2、修改时间信息：withYear withMonth withDayOfMonth withDayOfYear withHour withMinute withSecond withNano
        LocalDateTime localDateTime1 = localDateTime.withYear(2033).withMonth(3).withDayOfMonth(3);
        System.out.println(localDateTime1);

        // 3、加多少: plusYears  plusMonths plusDays plusWeeks plusHours plusMinutes plusSeconds plusNanos
        LocalDateTime localDateTime2 = localDateTime.plusYears(5).plusMonths(5).plusDays(5);
        System.out.println(localDateTime2);

        // 4、减多少：minusDays minusYears minusMonths minusWeeks minusHours minusMinutes minusSeconds minusNanos
        LocalDateTime localDateTime3 = localDateTime.minusYears(5).minusMonths(5).minusDays(5);
        System.out.println(localDateTime3);

        // 5、获取指定日期和时间的LocalDateTime对象：
        //    2029年12月12日12时12分12秒、 2029年12月12日12时12分12秒
        LocalDateTime localDateTime4 = localDateTime.of(2029,12,12,12,12);
        LocalDateTime localDateTime5 = localDateTime.of(2029,12,12,12,12);

        // 6、 判断2个日期、时间对象，所表示的时间是否相等，在前还是在后： equals、isBefore、isAfter
        boolean b1 = localDateTime4.equals(localDateTime5);
        System.out.println(b1);
        //判断是否在前
        LocalDateTime localDateTime6 = localDateTime.of(2029,12,12,12,12);
        LocalDateTime localDateTime7 = localDateTime.of(2030,12,12,12,12);
        boolean b2 = localDateTime6.isBefore(localDateTime7);
        System.out.println(b2);
        //判断是否在后
        boolean b3 = localDateTime6.isAfter(localDateTime7);
        System.out.println(b3);

        // 7、可以把LocalDateTime转换成LocalDate和LocalTime
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

    }
}
