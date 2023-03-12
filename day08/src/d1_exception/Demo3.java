package d1_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
目标：异常的处理方式
比如有如下的场景：
    A调用用B，B调用C；C中有异常产生抛给B，B中有异常产生又抛给A；
    异常到了A这里就不建议再抛出了，因为最终抛出被JVM处理程序就会异常终止，并且给用户看异常信息，用户也看不懂，体验很不好。
    这种场景下如何对异常进行处理呢？

处理方案有两种，分别如下：
    1.用try...catch捕获处理，并响应异常信息给用户

    2.用try...catch进行捕获，并尝试修复
 */
public class Demo3 {
    public static void main(String[] args) {
        //需求1：调用test1()方法，并捕获异常，打印异常信息
        /*try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (ParseException e) {
            System.out.println("输入的时间格式有误");
        }*/

        //需求2：调用getMoney()方法，并尝试修复异常
        while (true) {
            try {
                double money = getMoney();
                System.out.println("价格是:"+money);
                break;
            } catch (Exception e) {
                System.out.println("您输入的价格有误,请重新输入");
            }
        }
    }

    public static void test1() throws FileNotFoundException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2028-11-11 10:24:11");
        System.out.println(d);
        test2();
    }

    public static void test2() throws FileNotFoundException {
        // 读取文件的。
        InputStream is = new FileInputStream("D:/meinv.png");
    }


    public static double getMoney(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入合适的价格：");
            double money = sc.nextDouble();
            if(money >= 0){
                return money;
            }else {
                System.out.println("您输入的价格是不合适的！");
            }
        }
    }
}
