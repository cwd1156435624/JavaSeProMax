package d8_zuoye;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/*
使用FileUtils工具类，完成
    文件复制、
    文件夹复制、
    获取文件夹大小(sizeOf方法)、
    删除文件夹（deleteDirectory方法）操作
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //文件复制
        FileUtils.copyFile(new File("day10\\a.txt"),new File("day10\\c.txt"));
        //文件夹复制
        FileUtils.copyDirectory(new File("day10\\abc"),new File("day10\\bcd"));
        //获取文件夹大小
        long l = FileUtils.sizeOf(new File("day10\\abc"));
        System.out.println(l);
        //删除文件夹
        FileUtils.deleteDirectory(new File("day10\\bcd"));
    }
}
