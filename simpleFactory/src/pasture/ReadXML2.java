package pasture;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReadXML2 {
    public static Object getObject(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = documentBuilder.parse( new File("D:\\data\\ideaPorject\\design\\simpleFactory\\src\\pasture\\config.xml") );
            NodeList nodeList = document.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String cName = "pasture."+classNode.getNodeValue();
            System.out.println( "新类名："+cName );

            Class<?> c = Class.forName( cName );
            Object object = c.newInstance();
            return object;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
