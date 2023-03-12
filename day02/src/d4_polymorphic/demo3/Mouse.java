package d4_polymorphic.demo3;

public class Mouse extends Computer implements USB{
    @Override
    public void into() {
        System.out.println("鼠标插入了");
    }

    @Override
    public void out() {
        System.out.println("鼠标拔出了");
    }

    public void click(){
        System.out.println("鼠标点击了");
    }
}
