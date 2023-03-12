package d4_polymorphic.demo1;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("吃肉肉");
    }
}
