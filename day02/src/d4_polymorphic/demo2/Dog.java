package d4_polymorphic.demo2;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void kanmeng(){
        System.out.println("狗看门");
    }
}
