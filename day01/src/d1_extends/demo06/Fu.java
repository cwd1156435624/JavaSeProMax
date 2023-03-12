package d1_extends.demo06;

//父类
public class Fu {
    private String name;

    public Fu() {
        System.out.println("父类空参构造执行了...");
    }

    public Fu(String name) {
        System.out.println("父类有参构造执行了...");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
