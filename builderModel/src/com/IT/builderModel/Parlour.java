package com.IT.builderModel;


import javax.swing.*;
import java.awt.*;

/***
 * @class  this is product: parlour
 */
public class Parlour {

    private String wall;

    private String sofa;

    private String watch;

    public void setWall(String wall){
        this.wall = wall;
    }

    public void setSofa(String sofa){
        this.sofa = sofa;
    }

    public void setWatch(String watch){
        this.watch = watch;
    }

    public void show(){
        JFrame jf = new JFrame("建造模式测试");
        Container container = jf.getContentPane();
        JPanel jPanel = new JPanel(  );
        JScrollPane scrollPane = new JScrollPane( jPanel );

        String parlour = sofa+watch+wall;

        JLabel jLabel = new JLabel( new ImageIcon( "D:\\data\\ideaPorject\\design\\builderModel\\src\\com\\IT\\builderModel\\室内装修.jpg" ) );
        jPanel.setLayout( new GridLayout( 1,1 ) );
        jPanel.setBorder( BorderFactory.createTitledBorder("客厅") );
        jPanel.add(jLabel);
        container.add(scrollPane,BorderLayout.CENTER);
        jf.pack();
        jf.setVisible( true );
        jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

}
