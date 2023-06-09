package d4_zuoye.demo3;

import java.util.ArrayList;

/*
1.创建一个Student类，有name和age两个属性
2.创建一个ArrayList集合，往集合中添加10个Student对象
3.使用Stream流过滤集合中年龄>20的元素
4.截取前面的8个元素
5.跳过前面的2个元素
6.把Stream流中剩余的元素打印
 */
public class Demo3 {
    //2.创建一个ArrayList集合，往集合中添加10个Student对象
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("张三",20));
        list.add(new Student("李四",18));
        list.add(new Student("王五",19));
        list.add(new Student("赵六",25));
        list.add(new Student("前妻",27));
        list.add(new Student("王炸",28));
        list.add(new Student("小王",26));
        list.add(new Student("大王",24));
        list.add(new Student("蘑菇头",23));
        list.add(new Student("妹爷",29));
        list.add(new Student("老王",30));
        list.add(new Student("老李",22));

        list.stream()
                .filter(s->s.getAge()>20)//3.使用Stream流过滤集合中年龄>20的元素
                .limit(8) //4.截取前面的8个元素
                .skip(2)//5.跳过前面的2个元素
                .forEach(s-> System.out.println(s));//6.把Stream流中剩余的元素打印
    }
}
