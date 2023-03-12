package d1_extends.demo02;

/**
 * 需求：
 * 在传智教育的tlias教学资源管理系统中，存在学生、老师角色会进入系统
 * 学生：属性（名称，年龄，所在班级），行为（查看课表，填写听课反馈）
 * 老师：属性（名称，年龄，部门名称），行为（查看课表，发布问题）
 * 利用继承优化老师类和学生类
 */
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("王二狗");
        s.setAge(18);
        s.setClasses("Java就业班");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getClasses());
        s.ckkb();
        s.tkfk();
        System.out.println("-------------------");
        Teacher t = new Teacher();
        t.setName("李翠花");
        t.setAge(30);
        t.setBumen("学生办");
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getBumen());
        t.ckkb();
        t.fbwt();
    }
}
