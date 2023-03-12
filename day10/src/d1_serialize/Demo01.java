package d1_serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//目标：掌握对象字节输出流ObjectOutputStream往文件中写出对象
public class Demo01 {
    public static void main(String[] args) throws Exception {
        /**
         * ObjectOutputStream(OutputStream out)：
         *      把低级字节输出流包装成高级的对象字节输出流
         *
         * void writeObject(Object obj)：
         *      把对象写出去到对象序列化流的文件中去
         *
         * 注意：被写入对象的类必须实现Serializable接口
         *
         * 需求：
         *      分别创建一个Teacher对象和一个Student对象，使用对象序列化流把对象持久的存储到文件中保存
         *      创建一个Person对象，将其存储到文件中保存
         */

        Student stu = new Student("王二狗",18);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10\\a.txt"));
        //对象序列化
        oos.writeObject(stu);
        oos.close();

    }
}
