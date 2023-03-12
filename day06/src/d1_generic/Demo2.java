package d1_generic;

/*
目标：演示自定义泛型类
 */
public class Demo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        String s = list.get(0);
        System.out.println(s);
        System.out.println(list);
    }
}
