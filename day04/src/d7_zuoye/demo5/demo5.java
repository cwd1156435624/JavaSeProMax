package d7_zuoye.demo5;


import java.util.Arrays;
import java.util.Comparator;

/*
按下面的步骤完成需求

- 定义一个Student类，有姓名、年龄、身高三个属性
- 在测试类中创建一个Student数组，并创建建4个Student对象，存入数组中
- 使用Arrays的sort方法，对数组中的元素按照年龄升序排列（匿名内部类写法）
- 使用Arrays的sort方法，对数组中的元素按照年龄升序排列（Lambda标准格式）
- 使用Arrays的sort方法，对数组中的元素按照年龄升序排列（Lambda简化格式）
 */
public class demo5 {
    public static void main(String[] args) {
        Student s1 = new Student("王二狗",18,180);
        Student s2 = new Student("李翠花",20,165);
        Student s3 = new Student("吴刚",30,190);
        Student s4 = new Student("刘流子",19,177);
        Student[] stu = {s1,s2,s3,s4};

        //使用Arrays的sort方法，对数组中的元素按照年龄升序排列（匿名内部类写法）
        Arrays.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //使用Arrays的sort方法，对数组中的元素按照年龄升序排列（Lambda标准格式）
        Arrays.sort(stu, (Student o1, Student o2) -> {
                return o1.getAge() - o2.getAge();
        });

        //使用Arrays的sort方法，对数组中的元素按照年龄升序排列（Lambda简化格式）
        Arrays.sort(stu, (o1, o2) -> o1.getAge() - o2.getAge());

        //使用Arrays的sort方法，引用CompareByData类的compareByAge方法，对数组中的元素按照年龄升序排列
        Arrays.sort(stu, CompareByData::compareByAge);

        //引用CompareByData类的compareByHeight方法，对数组中的元素按照身高升序排列
        CompareByData cbd = new CompareByData();
        Arrays.sort(stu,cbd::compareByHeight);
    }
}
