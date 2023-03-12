package d2_prop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        //往集合中添加元素
        pro.setProperty("name","licuihua");
        pro.setProperty("password","456789");
        //把集合中的键和值写到属性文件当中去
        pro.store(new FileWriter("day10\\prop2.properties"),null);

    }
}
