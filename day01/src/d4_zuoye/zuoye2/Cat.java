package d4_zuoye.zuoye2;

public class Cat extends animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("颜色为"+getColor()+"的"+getAge()+"岁的猫,在吃" + something);
    }

    public void catchMouse(){
        System.out.println("会抓老鼠");
    }
}
