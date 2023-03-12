package d5_xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

//目标：掌握使用dom4j解析xml文件的api
public class Demo02 {
    public static void main(String[] args) throws Exception {
        /**
         * dom4j获取解析器、Document文档、根标签对象的API：
         *      public SAXReader()：创建Dom4j的解析器对象
         *      Document read(String url)：加载xml文件成为Document对象
         *      Element getRootElement()：获得根元素对象
         *
         * dom4j解析xml标签、属性、文本的API：
         *      List<Element> elements()：得到当前元素下所有子元素
         *      List<Element> elements(String name)：得到当前元素下指定名字的子元素返回集合
         *      Element element(String name)：得到当前元素下指定名字的子元素,如果有很多名字相同的返回第一个
         *      String getName()：得到元素名字
         *      String  attributeValue(String name)：通过属性名直接得到属性值
         *      String elementText(子元素名)：得到指定名称的子元素的文本
         *      String getText()：得到文本
         */
        SAXReader saxReader = new SAXReader();
        //读取xml文件，获取Document对象
        //获取src目录下contacts.xml的InputStream流对象
        InputStream is = Demo02.class.getResourceAsStream("/contacts.xml");
        Document read = saxReader.read(is);
        System.out.println(read);

        //获取xml文件的根标签
        Element rootElement = read.getRootElement();
        System.out.println(rootElement);

        System.out.println("---------------");
        //得到当前元素下所有子元素
        List<Element> list1 = rootElement.elements();
        for (Element element : list1) {
            System.out.println(element);
        }

        System.out.println("-----------");
        //得到当前元素下指定名字的子元素返回集合
        List<Element> list2 = rootElement.elements("contact");
        for (Element element : list2) {
            System.out.println(element);
        }

        System.out.println("------------");
        //到当前元素下指定名字的第一个子元素
        Element contact = rootElement.element("contact");
        System.out.println(contact);

        System.out.println("--------------");
        //得到元素名字
        String name = rootElement.element("contact").getName();
        System.out.println("名称叫:" + name);

        System.out.println("---------------");
        //通过属性名直接得到属性值
        String id = rootElement.element("contact").attributeValue("id");
        System.out.println("序号是"+id);

        System.out.println("----------------");
        //得到指定名称的子元素的文本
        String name1 = rootElement.element("contact").elementText("name");
        System.out.println(name1);

        String gender = rootElement.element("contact").elementText("gender");
        System.out.println(gender);

        String email = rootElement.element("contact").elementText("email");
        System.out.println(email);

        System.out.println("------------");

    }
}
