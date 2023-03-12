package d2_map;

import java.util.Comparator;
import java.util.TreeMap;

/*
目标：TreeMap集合对自定义键进行排序
 */
public class Demo7 {
    public static void main(String[] args) {
        TreeMap<Student,String> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        map.put(new Student("王二狗",18),"武汉");
        map.put(new Student("李翠花",20),"长沙");
        map.put(new Student("吴刚",30),"广州");
        map.put(new Student("刘瘤子",35),"北京");
        map.put(new Student("刘瘤子",35),"深圳");

        map.forEach((student, s) -> System.out.println(student+"..." +s));

    }
}
