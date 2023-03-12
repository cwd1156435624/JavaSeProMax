package d4_polymorphic.demo1;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("吃老鼠");
    }
}
