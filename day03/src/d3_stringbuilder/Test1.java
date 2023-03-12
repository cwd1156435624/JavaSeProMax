package d3_stringbuilder;

/*
String练习1：设计一个方法，用于返回任意整型数组的内容，要求返回的数组内容格式如：[11, 22, 33]
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44};
        String str = PrintArr(arr);
        System.out.println(str);
    }

    public static String PrintArr(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                sb.append(arr[i]).append("]");
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }
}
