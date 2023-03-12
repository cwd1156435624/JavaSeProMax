package d5_zuoye.demo4;

public class Computer {
    public static void useUsb(USB u){
        u.into();
        if (u instanceof Mouse){
            ((Mouse) u).click();
        }
        if (u instanceof KeyBoard){
            ((KeyBoard) u).type();
        }
        u.out();
    }
}
