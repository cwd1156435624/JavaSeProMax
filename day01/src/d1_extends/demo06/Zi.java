package d1_extends.demo06;

//子类
public class Zi extends Fu {
    public Zi() {
        System.out.println("子类空参构造执行了...");
    }

    public Zi(String name) {
        super(name);
        System.out.println("子类有参构造执行了...");
    }
}
