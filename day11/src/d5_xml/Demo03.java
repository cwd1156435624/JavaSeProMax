package d5_xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        /**
         * 需求：
         *      使用DOM4J解析contacts.xml文件，将解析到的数据封装到学生对象中
         *      并将学生对象存储到ArrayList集合中，最后遍历集合
         */

        SAXReader saxReader = new SAXReader();
        //方式一
        //InputStream is = Demo03.class.getResourceAsStream("/contacts.xml")
        //方式二
        InputStream is = Demo03.class.getClassLoader().getResourceAsStream("contacts.xml");
        Document read = saxReader.read(is);
        Element rootElement = read.getRootElement();
        ArrayList<Contact> contacts = new ArrayList<>();

        //获取contacts.xml中的所有contact对象信息
        List<Element> list = rootElement.elements("contact");
        for (Element element : list) {
            String id = element.attributeValue("id");
            String name = element.elementText("name");
            String gender = element.elementText("gender");
            String email = element.elementText("email");

            Contact contact = new Contact(Integer.parseInt(id),name,gender,email);
            contacts.add(contact);
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
        }


    }
}
