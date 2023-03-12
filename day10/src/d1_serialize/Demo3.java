package d1_serialize;

import java.io.*;
import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("王二狗",18);
        Student s2 = new Student("李翠花",19);
        Student s3 = new Student("吴刚",20);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10\\a.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10\\a.txt"));
        oos.writeObject(list);
        oos.close();
        ArrayList<Student> list1 = (ArrayList<Student>) ois.readObject();
        for (Student student : list1) {
            System.out.println(student);
        }

    }
}
