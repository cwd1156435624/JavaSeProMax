package d3_stringbuilder;

/*
目标：掌握StringBuilder与String的区别，StringBuilder构造器
1.区别：
    String是一个不可变字符串，每次拼接字符串内容都会创建新的字符串，频繁修改效率低
    StringBuilder是一个字符串容器，容器中的内容可以发生改变，对容器操作效率高

2.创建StringBuilder对象

 */
public class Demo1 {
    public static void main(String[] args) {
        //test1();
        //test2();

        StringBuilder stb1 = new StringBuilder("SB");
        System.out.println(stb1);
    }

    public static void test1(){
        String str = "";
        for (int i = 0; i < 1000000; i++) {
            str+="abc";
        }
        System.out.println(str);
    }

    public static void test2(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
