package d3_stringbuilder;

/*
StringBuilder练习2：设计一个方法，用于判断字符串是否对称，如果对称返回true,否则返回false.
                    如：abc不是对称的，aba是对称的

 */
public class Test2 {
    public static void main(String[] args) {
        String s = "aba";
        boolean b = judge(s);
        System.out.println(b);
    }

    public static boolean judge(String s){
        //封装为StringBuilder类型
        StringBuilder sb = new StringBuilder(s);
        //反转
        sb.reverse();
        //对比
        boolean result = sb.toString().equals(s);
        return result;
    }
}
