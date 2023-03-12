package d4_interface.demo3;

public class InterImpl implements Inter{
    @Override
    public void test1() {
        System.out.println("test1方法执行了");
    }

    public void test2(){
        System.out.println("InterImpl...test2执行了");
    }
}
