package d2_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
目标：演示List集合的遍历方式 ———— 4种
 */
public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("袁鑫涛");
        list.add("王二狗");
        list.add("李翠花");
        list.add("吴刚");
        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------");

        //Iterator遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------------");

        //增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------");

        //lambda表达式(forEach方法)
        list.forEach(s -> System.out.println(s));

    }
}
