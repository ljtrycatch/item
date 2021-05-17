package com.singleModel;

import javax.swing.*;
import java.awt.*;

public class SingletonHungry {
    public static void main(String[] args) {
            JFrame jf = new JFrame( "饿汉模式测试" );
        jf.setLayout( new GridLayout( 1, 2 ) );
        Container container = jf.getContentPane();
        Bajie obj1 = Bajie.getInstance();
        container.add( obj1 );
        Bajie obj2 = Bajie.getInstance();
        container.add(obj2);
        if(obj1==obj2){
            System.out.println("他们是同一个人");
        }else{
            System.out.println("他们不是同一个人");
        }
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}


class Bajie extends JPanel{
    private static  Bajie instance  = new Bajie();

    private Bajie(){
        JLabel jLabel = new JLabel( new ImageIcon( "D:\\data\\ideaPorject\\design\\singleton\\src\\Bajie.jpg" ) );
        this.add(jLabel);
    }

    public static Bajie getInstance(){
        return instance;
    }

}