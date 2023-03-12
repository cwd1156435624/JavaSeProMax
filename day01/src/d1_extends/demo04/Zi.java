package d1_extends.demo04;

//子类
public class Zi extends Fu {
    String name = "罗志祥";
    int age = 23;

    public void print() {
        String name = "李易峰";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

    }

    public void drive() {
        System.out.println("驾驶兰博基尼在城市的灯红酒绿间穿梭！");
        super.drive();
    }
}
