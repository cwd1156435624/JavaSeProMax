package d6_method_reference;

import java.util.Arrays;
import java.util.Comparator;

/*
目标：掌握特殊的方法引用的使用场景以及引用格式
1.使用场景：
    如果某个Lambda表达式里只是调用一个实例方法，并且前面参数列表中的第一个参数是作为方法的主调，后面的所有参数都是作为该实例方法的入参，
    则此时也可以使用类名进行引用。

2.引用格式
    类名::方法名
 */
public class Demo3 {
    public static void main(String[] args) {
        String[] names = {"boby", "angela", "Andy" ,"dlei", "caocao", "Babo", "jack", "Cici"};

        //1.要求忽略首字符大小写进行排序。
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = o1.compareToIgnoreCase(o2);
                return num;
            }
        });
        //字符串比较大小指的是字典顺序（a,b,c,d,e...），比较字符串的第一个不相同的字符
        //2.lambda表达式写法
        Arrays.sort(names,(o1, o2) -> o1.compareToIgnoreCase(o2));

        //compareToIgnoreCase这个写法是属于String类的，需要用String类来引用
        //3.方法引用写法
        Arrays.sort(names,String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));



    }
}
