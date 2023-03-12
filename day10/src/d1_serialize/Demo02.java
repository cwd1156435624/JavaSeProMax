package d1_serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//目标：掌握对象字节输入流ObjectInputStream从文件中读取对象
public class Demo02 {
    public static void main(String[] args) throws Exception {
        /**
         * ObjectInputStream(InputStream out)：把低级字节输如流包装成高级的对象字节输入流
         * Object readObject()：把存储到磁盘文件中去的对象数据恢复成内存中的对象返回
         *
         * 注意：读取对象的顺序要和写入的顺序保持一致
         */

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10\\a.txt"));
        //对象反序列化
        Student stu = (Student) ois.readObject();
        System.out.println(stu);
        ois.close();

    }
}
