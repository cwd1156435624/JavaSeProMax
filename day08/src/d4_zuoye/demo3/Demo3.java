package d4_zuoye.demo3;

/*
1.自定义一个异常类，表示数字超过范围要求见名知意
2.写一个方法test，用于打印1~100以内的所有偶数，如果数字不在这个范围则抛出，自定义异常对象
3.在主方法中调用test方法，并使用try...catch对异常进行处理
 */
public class Demo3 {
    public static void main(String[] args)  {
        try {
            test(20);
        } catch (NumberIllegalExecption e) {
            throw new RuntimeException(e);
        }
    }

    public static void test(int num) throws NumberIllegalExecption {
        if (num < 1 || num > 100){
            throw new NumberIllegalExecption("数字不在范围内");
        }else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
