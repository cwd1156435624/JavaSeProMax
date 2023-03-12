package d5_zuoye.demo4;

public class KeyBoard extends Computer implements USB {
    @Override
    public void into() {
        System.out.println("键盘插入了");
    }

    @Override
    public void out() {
        System.out.println("键盘拔出了");
    }

    public void type(){
        System.out.println("键盘打字了");
    }
}
