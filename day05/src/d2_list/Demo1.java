package d2_list;

import java.util.ArrayList;
import java.util.List;

/*
目标：演示List集合特点、特有方法
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //public void add(int index, E element)  添加
        list.add("袁鑫涛");
        list.add("王二狗");
        list.add("李翠花");
        list.add(2,"吴刚");
        System.out.println(list);

        //public E remove(int index)  删除
        list.remove(2);
        System.out.println(list);

        //public E set(int index, E element)  修改
        list.set(1,"陈帅帅");
        System.out.println(list);

        //public E get(int index)  获取
        String s = list.get(0);
        System.out.println(s);
    }
}
