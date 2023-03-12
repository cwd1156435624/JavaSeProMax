package d1_generic;

import java.util.ArrayList;

/*
目标：演示自定义泛型方法
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        addElment(list,"王二狗","李翠花","吴刚");
        System.out.println(list);

    }

    public static <T> void addElment(ArrayList<T> list, T t1,T t2,T t3){
        list.add(t1);
        list.add(t2);
        list.add(t3);
    }
}
