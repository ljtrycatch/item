package com.IT.ghost;

import java.util.HashMap;
import java.util.Scanner;

interface Shape extends Cloneable{
    //拷贝
    public Object clone();
    //计算面积
    public void countArea();
}

class Circle implements Shape{
    public Object clone(){
        Circle w = null;
        try{
            w = (Circle) super.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("拷贝圆失败");
        }
        return w;
    }

    public void countArea(){
        int r = 0;
        System.out.println("这是一个圆，请输入半径：");
        Scanner scanner = new Scanner( System.in );
        r = scanner.nextInt();
        System.out.println("S圆="+3.1415926*r*r+"\n");

    }

}

class Square implements Shape{
    public Object clone(){
        Square b = null;
        try{
            b = (Square) super.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("正方形拷贝失败");
        }
        return b;
    }

    public void countArea(){
        int a = 0;
        System.out.println("请输入正方型的边长");
        Scanner scanner = new Scanner( System.in );
        a = scanner.nextInt();
        System.out.println("S正="+a*a);
    }
}

class ProtoTypeManager{
    private HashMap<String,Shape> ht = new HashMap<String,Shape>(  );

    public ProtoTypeManager(){
        ht.put("Circle",new Circle());
        ht.put( "Square",new Square() );
    }

    public void addShape(String key,Shape shape){
        ht.put( key,shape );
    }

    public Shape getShape(String key){
        Shape temp = ht.get(key);
        return (Shape) temp.clone();
    }
}
public class ProtoTypeShape {
    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj = (Circle)pm.getShape("Circle");
        obj.countArea();
        Shape obj2 = (Square)pm.getShape("Square");
        obj2.countArea();
    }

}
