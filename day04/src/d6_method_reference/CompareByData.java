package d6_method_reference;

import d5_lambda.Student;

public class CompareByData {
    public static int compareByAge(Student o1, Student o2){
        return o1.getAge()-o2.getAge();
    }

    public  int compareByHeight(Student o1, Student o2){
        return Double.compare(o1.getHeight(),o2.getHeight());
    }
}
