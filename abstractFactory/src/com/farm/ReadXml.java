package com.farm;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReadXml {
    public static Object getObject(){
        try{
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = documentBuilder.parse( new File("D:\\data\\ideaPorject\\design\\abstractFactory\\src\\com\\farm\\config.xml") );
            NodeList n1 = document.getElementsByTagName( "className" );
            Node node = n1.item(0).getFirstChild();
            String cName = "com.farm." + node.getNodeValue();
            System.out.println("新类名"+cName);
            Class<?> c = Class.forName( cName );
            Object obj = c.newInstance();
            return  obj ;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
