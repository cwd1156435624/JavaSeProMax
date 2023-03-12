package d3_collections;

/*
目标：演示可变参数的用法
 */
public class Demo1 {
    public static void main(String[] args) {
        int sum = sum(10,30,50,60);
        System.out.println(sum);
        int[] arr = {10,3,5,9,60,80};
        int sum1 = sum(arr);
        System.out.println(sum1);
    }

    public static int sum (int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
