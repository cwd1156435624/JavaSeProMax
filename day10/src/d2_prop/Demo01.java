package d2_prop;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

//目标：掌握Properties属性集对象的使用
public class Demo01 {
    public static void main(String[] args) throws Exception {
        /**
         * Properties代表的是一个属性文件，可以把自己对象中的键值对信息存入到一个属性文件中去
         * 属性文件：后缀是.properties结尾的文件,里面的内容都是 key=value，后续做系统配置信息的
         *
         * api：
         *      load(InputStream inStream)：从输入字节流读取属性列表（键和元素对）
         *      load(Reader reader)：从输入字符流读取属性列表（键和元素对）
         *      store(OutputStream out, String comments)：
         *              将此属性列表（键和元素对）写入此 Properties表中，以适合于使用 load(InputStream)方法的格式写入输出字节流
         *      store(Writer writer, String comments)：
         *              将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式写入输出字符流
         *      Object setProperty(String key, String value)：保存键值对（put）
         *      String getProperty(String key)：使用此属性列表中指定的键搜索属性值 (get)
         *      Set<String> stringPropertyNames()：所有键的名称的集合  (keySet())
         */

        Properties prop = new Properties();
        //读取属性列表
        prop.load(new FileReader("day10\\prop.properties"));
        //获取键对应的值
        String username = prop.getProperty("username");
        System.out.println(username);

        String password = prop.getProperty("password");
        System.out.println(password);
        System.out.println("-------------");
        //获取所有的键和值
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String value = prop.getProperty(s);
            System.out.println(s+"...."+value);
        }

    }
}
