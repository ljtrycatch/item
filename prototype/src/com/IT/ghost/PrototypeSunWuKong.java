package com.IT.ghost;

import javax.swing.*;
import java.awt.*;

public class PrototypeSunWuKong {
    public static void main(String[] args){
        JFrame jFrame = new JFrame( "原型模式的测试" );
        jFrame.setLayout( new GridLayout( 1,2 ) );
        Container container = jFrame.getContentPane();
        SunWuKong obj1 = new SunWuKong();
        container.add(obj1);
        SunWuKong obj2 = new SunWuKong();
        container.add(obj2);
        SunWuKong obj3 = new SunWuKong();
        container.add( obj3 );
        SunWuKong obj4 = new SunWuKong();
        container.add( obj4 );

        jFrame.pack();
        jFrame.setVisible( true );
        jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

}

//拷贝的对象
class SunWuKong extends JPanel implements java.lang.Cloneable{
    private static final long serialVersionUID = 5543049531872119328L;


    public SunWuKong(){
        JLabel l1 = new JLabel( new ImageIcon("D:\\data\\ideaPorject\\design\\prototype\\src\\sunwukong.jpg") );
        this.add(l1);
    }

    public Object clone(){
        SunWuKong sunWuKong = null;
        try{
            sunWuKong = (SunWuKong)super.clone();

        }catch(CloneNotSupportedException e){
            System.out.println("拷贝孙悟空失败！");
        }
        return sunWuKong;
    }

}