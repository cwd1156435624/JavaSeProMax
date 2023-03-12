package d5_release;

import java.io.*;

//目标：掌握try-catch-finally资源释放的使用
public class Demo01 {
    public static void main(String[] args){
        /**
         * finally：放在try-catch后面的，无论是正常执行还是异常执行代码，最后一定要执行，除非JVM退出
         * 作用：一般用于进行最后的资源释放操作（专业级做法）
         */

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("day09\\a.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("day09\\b.txt"));

            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
