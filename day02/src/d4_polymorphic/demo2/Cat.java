package d4_polymorphic.demo2;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }
    public void zhuals(){
        System.out.println("猫抓老鼠");
    }
}
