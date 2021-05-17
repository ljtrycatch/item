package demo.abstractFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReadXML1 {

    //用于从xml配置文件中提取具体的类名，并返回一个实例对象
    public static Object getObject(){
        try{
            //创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builderFactory = documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc = builderFactory.parse(new File("D:\\data\\ideaPorject\\design\\simpleFactory\\src\\demo\\abstractFactory\\config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item( 0 ).getFirstChild();
            //src 下的要拼接完整，否则找不到路径
            String cName ="demo.abstractFactory." + classNode.getNodeValue();
            //System.out.println("新类名：" + cName);
            //通过类名生成实例对象并将其返回
            //String s = "demo.abstractFactory.FactoryA";
            Class<?> c = Class.forName( cName );
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
