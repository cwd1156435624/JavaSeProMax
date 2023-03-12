package d5_zuoye.demo4;

/*
目标：多态的转型
 */
public class Demo {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Computer.useUsb(m);

        KeyBoard kb = new KeyBoard();
        Computer.useUsb(kb);
    }
}
