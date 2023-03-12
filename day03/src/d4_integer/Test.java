package d4_integer;

/*
Integer练习：求下面字符串中每一个整数的和
    String str = "100,200,300,50,60,75,250";
 */
public class Test {
    public static void main(String[] args) {
        String str = "100,200,300,50,60,75,250";
        //分割
        String[] s1 = str.split(",");
        int sum = 0;

        for (int i = 0; i < s1.length; i++) {
            //转化为整数类型
            int i1 = Integer.valueOf(s1[i]);
            //求和
            sum +=i1;
        }
        System.out.println(sum);
    }
}
