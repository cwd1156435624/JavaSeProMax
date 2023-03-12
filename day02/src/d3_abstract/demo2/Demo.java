package d3_abstract.demo2;

/*
目标： 抽象类的应用（模板方法模式）
 */
public class Demo {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.write();

        Anna anna = new Anna();
        anna.write();
    }
}
