package d4_zuoye;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
假设在`C:\itheima\`目录下有若干个文件或者文件夹，
请编写程序打印`C:\itheima`目录下所有文件的绝对路径，
和每一个文件最后一个修改的时间（格式为：xxxx月xx年xx日 xx时xx分xx秒）
 */
public class Demo2 {
    public static void main(String[] args) {
        File file = new File("C:\\itheima\\");
        File[] files = file.listFiles();
        for (File file1 : files) {
            File abf = file1.getAbsoluteFile();
            long time = file1.lastModified();
            Date date = new Date(time);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
            String parse = sdf.format(date);
            System.out.println(abf + "..." +parse);
        }
    }
}
