package d6_safe;

//需求：小明和小红是一对夫妻，他们有一个共同的账户，余额是10万元，模拟2人同时去取钱10万
public class Demo01 {
    public static void main(String[] args) {
        Account account = new Account(100000);
        MyRunnable mr = new MyRunnable(account,100000);
        Thread t1 = new Thread(mr,"小明");
        Thread t2 = new Thread(mr,"小红");
        t1.start();
        t2.start();
    }
}

