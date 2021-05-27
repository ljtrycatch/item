package com.IT.builderModel;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReadXML {
    public static Object getObject(){
        try {
            DocumentBuilderFactory  dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document document;
            document = builder.parse(new File( "D:\\data\\ideaPorject\\design\\builderModel\\src\\com\\IT\\builderModel\\config.xml" ) );
            NodeList nl = document.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = "com.IT.builderModel." + classNode.getNodeValue();
            System.out.println("新类名：" + cName);
            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
