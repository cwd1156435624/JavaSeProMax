package d1_exception;

/*
目标：自定义异常、抛出编译时异常和运行时异常的区别

需求：写一个saveAge(int age)方法，在方法中对参数age进行判断，如果age<0或者>=150就认为年龄不合法，
    如果年龄不合法，就给调用者抛出一个年龄非法异常。

 */
public class Demo2 {
    public static void main(String[] args) {
        try {
            saveAge(-20);
        } catch (AgeIllegalExecption e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveAge(int age) throws AgeIllegalExecption {
        if (age < 0 || age >=150){
            throw new AgeIllegalExecption("您的年龄输入不合法");
        }else {
            System.out.println(age + "年龄输入成功");
        }
    }
}
