package zuoye;

/*
需求 :  利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量

- 如用户输入字符串:"helloworldjava",程序输出结果：
- h-1 e-1 l-3 o-2 w-1 r-1 d-1 j-1 a-2 v-1   （顺序不做要求）
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                Integer count = map.get(c);
                map.put(c,count+1);
            }else {
                map.put(c,1);
            }
        }
        map.forEach((character, integer) -> System.out.println(character + "..." + integer));
    }
}
