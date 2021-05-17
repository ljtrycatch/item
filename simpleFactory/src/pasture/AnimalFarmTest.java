package pasture;

import javax.swing.*;
import java.awt.*;

public class AnimalFarmTest {

    public static void main(String[] args){
        try {
            Animal animal ;
            AnimalFarm animalFarm;
            animalFarm = (AnimalFarm)ReadXML2.getObject();
            animal = animalFarm.newAnimal();
            animal.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}





//抽象产品： 动物类
interface Animal{
    public void show();
}

//抽象工厂：牧场
interface AnimalFarm{
public Animal newAnimal();
}

//具体工厂：养马厂
class HorseFarm implements AnimalFarm{
    @Override
    public Animal newAnimal(){
        System.out.println("购进新马");
        return new Horse();
    }
}

class CattleFarm implements AnimalFarm{
    @Override
    public Animal newAnimal(){
        System.out.println("购进新的牛");
        return new Cattle();
    }
}
//具体的产品：马类
class Horse implements Animal{
    JScrollPane jsp = new JScrollPane(  );
    JFrame jf = new JFrame( "工厂方法模式测试" );
    public Horse(){
        Container container = jf.getContentPane();
        JPanel pl = new JPanel();
        pl.setLayout(new GridLayout(1,1));
        pl.setBorder(BorderFactory.createTitledBorder("动物：马"));
        jsp = new JScrollPane( pl );
        container.add( jsp, BorderLayout.CENTER );
        JLabel l1 = new JLabel(new ImageIcon("D:\\data\\ideaPorject\\design\\simpleFactory\\src\\pasture\\白龙马.jpg"));
        pl.add(l1);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    @Override
    public void show(){
        jf.setVisible( true );
    }

}

class Cattle implements Animal{
    JScrollPane jsp = new JScrollPane(  );
    JFrame jf = new JFrame( "工厂方法模式测试" );
    public Cattle(){
        Container container = jf.getContentPane();
        JPanel jPanel = new JPanel(  );
        jPanel.setLayout( new GridLayout( 1,1 ) );
        jPanel.setBorder( BorderFactory.createTitledBorder("动物：牛") );
        jsp = new JScrollPane(jPanel);
        container.add( jsp,BorderLayout.CENTER );
        JLabel jLabel = new JLabel(new ImageIcon("D:\\data\\ideaPorject\\design\\simpleFactory\\src\\pasture\\大角牛.jpg"));
        jPanel.add( jLabel );
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void show(){
        jf.setVisible( true );
    }

}


