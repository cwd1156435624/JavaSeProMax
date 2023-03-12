package d3_regex;

/*
目标：体验正则表达式月传统方式，
 */
public class Demo1 {
    public static void main(String[] args) {
        String qq = "1156435624";
        boolean b1 = qq.matches("[1-9][0-9]{5,19}");
        System.out.println(b1);

    }

    /*
    在下面方法中使用传统方式，校验qq号码是否符合要求
        1、判断qq号码是否为null
        2、qq至少是不是null,不是以0开头的，满足6-20之间的长度。
           如果满足条件，返回true; 否则返回false
     */
    public static boolean checkQQ(String qq){

        return true;
    }
}
