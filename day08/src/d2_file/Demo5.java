package d2_file;

/*
目标：理解什么是递归、以及递归代码的执行流程

需求：求1~5的阶乘（5的阶乘 = 1*2*3*4*5）
 */
public class Demo5 {
    public static void main(String[] args) {
        int f = f(5);
        System.out.println(f);
    }

    public static int f(int n){
        if (n == 1){
            return 1;
        }else {
            return f(n-1) * n;
        }
    }
}
