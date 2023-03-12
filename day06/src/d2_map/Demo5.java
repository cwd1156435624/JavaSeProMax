package d2_map;

import java.util.HashMap;

/*
目标：HashMap集合存储自定义对象作为键，保证键的唯一性
 */
public class Demo5 {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();
        map.put(new Student("王二狗",18),"武汉");
        map.put(new Student("李翠花",20),"长沙");
        map.put(new Student("吴刚",30),"广州");
        map.put(new Student("刘瘤子",35),"北京");
        map.put(new Student("刘瘤子",35),"深圳");

        map.forEach(((student, s) -> System.out.println(student + "..." + s)));
    }
}
