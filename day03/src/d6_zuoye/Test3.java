package d6_zuoye;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘录入
        System.out.println("请输入字符串：");
        String s = sc.nextLine();

        //定义一个变量计算总和
        int sum = 0;
        //切割字符串
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            int num = Integer.parseInt(s1[i]);
            sum += num;
        }
        //计算平均值，保留两位小数
        BigDecimal bd1 = BigDecimal.valueOf(sum);
        BigDecimal bd2 = BigDecimal.valueOf(s1.length);

        BigDecimal avg = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(avg);

    }
}
