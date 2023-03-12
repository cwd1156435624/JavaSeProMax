package d3_commons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

//目标：掌握在程序中导入commons-io简化io功能实现
public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         * commons-io是apache开源基金组织提供的一组有关IO操作的类库，可以提高IO功能开发的效率
         * commons-io工具包提供了很多有关io操作的类。有两个主要的类FileUtils, IOUtils
         *
         * FileUtils常用方法：
         *      String readFileToString(File file, String encoding)：读取文件中的数据, 返回字符串
         *      void copyFile(File srcFile, File destFile)：复制文件
         *      void copyDirectoryToDirectory(File srcDir, File destDir)：复制文件夹
         *
         * 需求：使用commons-io简化io流读写
         */

        FileUtils.copyFile(new File("day10\\a.txt"),new File("day10\\b.txt"));
    }
}
