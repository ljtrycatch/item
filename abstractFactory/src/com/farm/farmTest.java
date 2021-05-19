package com.farm;

import javax.swing.*;
import java.awt.*;

public class farmTest {
    public static void main(String[] args) {
        try{
            Farm f;
            Animal a;
            Plant p;
            f = (Farm)ReadXml.getObject();
            a = f.newAnimal();
            p = f.newPlant();
                    a.show();
            p.show();
        }catch (Exception e){
            System.out.println(e.getMessage());        }
    }
}

//抽象产品：动物类
interface Animal {
    public void show();
}

class Horse implements Animal {

    JScrollPane scrollPane;
    JFrame jf = new JFrame( "抽象工厂模式的测试" );

    public Horse() {
        Container container = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout( new GridLayout( 1, 1 ) );
        p1.setBorder( BorderFactory.createTitledBorder( "动物：马" ) );
        scrollPane = new JScrollPane( p1 );
        container.add( scrollPane, BorderLayout.CENTER );
        JLabel l1 = new JLabel( new ImageIcon( "" ) );
        p1.add( l1 );
        jf.pack();
        jf.setVisible( true );
        jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    @Override
    public void show() {
        jf.setVisible( true );
    }
}

class Cattle implements Animal {

    JScrollPane jScrollPane = new JScrollPane();
    JFrame jFrame = new JFrame( "抽象工厂测试" );


    public Cattle() {
        Container container = jFrame.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout( new GridLayout( 1, 1 ) );
        p1.setBorder( BorderFactory.createTitledBorder( "动物：牛" ) );
        jScrollPane = new JScrollPane( p1 );
        container.add( jScrollPane, BorderLayout.CENTER );
        JLabel l1 = new JLabel( new ImageIcon( "D:\\data\\ideaPorject\\design\\abstractFactory\\src\\com\\farm\\牛.jpg" ) );
        p1.add( l1 );
        jFrame.pack();
        jFrame.setVisible( true );
        jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    @Override
    public void show() {
        jFrame.setVisible( false );
    }
}



//抽象植物类
interface Plant {
    public void show();
}


class Fruitage implements Plant{

    JScrollPane jScrollPane;
    JFrame jFrame = new JFrame( "抽象工厂测试" );

    public Fruitage(){
         Container  container = jFrame.getContentPane();
         JPanel jPanel = new JPanel(  );
         jPanel.setLayout(new GridLayout(1,1));
         jPanel.setBorder( BorderFactory.createTitledBorder("植物：水果") );
         jScrollPane = new JScrollPane( jPanel );
         container.add(jScrollPane,BorderLayout.CENTER);
         JLabel label = new JLabel( new ImageIcon("") );
         jPanel.add(label);
         jFrame.pack();
         jFrame.setVisible(true);
         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void show(){
        jFrame.setVisible( true );
    }

}

//具体类 蔬菜类
class Vegetables implements Plant{

    JScrollPane jScrollPane = new JScrollPane(  );
    JFrame jFrame = new JFrame( "抽象工厂测试" );
    public Vegetables(){
        Container container = jFrame.getContentPane();
        JPanel jPanel = new JPanel(  );
        jPanel.setLayout(new GridLayout(1,1));
        jPanel.setBorder(BorderFactory.createTitledBorder("植物：蔬菜"));
        jScrollPane = new JScrollPane( jPanel );
        container.add(jScrollPane,BorderLayout.CENTER);
        JLabel label = new JLabel(new ImageIcon(""));
        jPanel.add(label);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void show(){
        jFrame.setVisible( false );
    }

}

//抽象工厂  农场
interface Farm{
    public Animal newAnimal();
    public Plant newPlant();
}

class SGFarm implements Farm{


    @Override
    public Animal newAnimal(){
        System.out.println("新牛产生");
        return new Cattle();
    }

    @Override
    public Plant newPlant(){
        System.out.println("新生蔬菜");
        return new Vegetables();
    }
}

//具体工厂：上饶农场类
class SRfarm implements Farm {

    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果长成！");
        return new Fruitage();
    }
}