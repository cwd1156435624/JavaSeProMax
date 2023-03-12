package d3_stringbuilder;

/*
目标：掌握StringBuilder的常用方法
 */
public class Demo2 {
    public static void main(String[] args) {
        //1.public StringBuilder append(String s): 往StringBuilder容器中添加元素，并返回StringBuilder容器本身、
        StringBuilder str1 = new StringBuilder();
        str1.append(123123).append(1.11).append(true);
        System.out.println(str1);

        //2.public StringBuilder reverse(): 将StringBuilder容器中的内容反转，并返回StringBuilder容器本身
        str1.reverse();
        System.out.println(str1);

        //3.public StringBuilder toString(): 将StringBuilder转换为String
        str1.toString();
        System.out.println(str1);
    }
}
