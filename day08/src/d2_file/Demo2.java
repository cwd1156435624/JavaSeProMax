package d2_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
目标：File类判断、获取文件信息的方法
 */
public class Demo2 {
    public static void main(String[] args) {
        //public boolean exists()  判断路径是否存在
        File f1 = new File("D:\\idea\\IdeaSoftware\\JavaSeProMax\\day08\\a.txt");
        File f2 = new File("day08\\abc");
        System.out.println(f1.exists());
        System.out.println(f2.exists());

        //public boolean isFile()  判断是否为文件
        System.out.println(f1.isFile());
        System.out.println(f2.isFile());

        //public boolean isDirectory()  判断是否为文件夹
        System.out.println(f1.isDirectory());
        System.out.println(f2.isDirectory());

        //public String getName()  返回该路径下文件的名字
        System.out.println(f1.getName());
        System.out.println(f2.getName());

        //public long length()  返回该文件的大小(字节数)
        System.out.println(f1.length());
        System.out.println(f2.length());

        //public long lastModified()  获取文件最后一次修改的时间
        long time = f1.lastModified();
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);

        //public String getPath()  获取File对象封装的文件路径
        System.out.println(f2.getPath());

        //public getAbsolutePath()  获取文件的绝对路径,返回值为String类型
        System.out.println(f1.getAbsolutePath());

        //public getAbsoluteFile()  获取文件的绝对路径,返回值为File类型
        System.out.println(f1.getAbsoluteFile());

    }
}
