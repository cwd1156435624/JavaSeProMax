package d4_polymorphic.demo3;

/*
目标：多态的转型
 */
public class Demo {
    public static void main(String[] args) {
        Computer m = new Mouse();
        Computer.useUsb((USB) m);

        Computer kb = new KeyBoard();
        Computer.useUsb((USB) kb);
    }
}
