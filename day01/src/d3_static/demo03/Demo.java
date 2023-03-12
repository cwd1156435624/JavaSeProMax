package d3_static.demo03;
//综合案例
public class Demo {
    public static void main(String[] args) {
        /**
         * 需求：
         *      1.在黑马头条科技有限公司，员工分为产品经理和程序员两种；
         *      2.他们都有姓名、年龄、部门名称、公司名称等属性；还有工作的行为；
         *      3.产品经理的工作职责设计产品原型，程序员的工作职责是使劲敲代码。
         */
        Programmer pr = new Programmer("张三",20,"研发部");
        System.out.println("我是" + Employee.companyNme + "的员工");
        System.out.println("我的名字是:" + pr.getName());
        System.out.println("我的年龄是:" + pr.getAge());
        System.out.println("我的部门是:" + pr.getDept());
        pr.work();
        System.out.println("--------");
        ProductManager pm = new ProductManager("李翠花",25,"产品部");
        System.out.println("我是" + Employee.companyNme + "的员工");
        System.out.println("我的名字是:" + pm.getName());
        System.out.println("我的年龄是:" + pm.getAge());
        System.out.println("我的部门是:" + pm.getDept());
        pm.work();
    }
}
