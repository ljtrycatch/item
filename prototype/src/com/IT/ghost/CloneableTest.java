package com.IT.ghost;

public class CloneableTest {

    public static void main(String[] args){
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = new Realizetype();
        //=判断存储空间  他们是两个不同的对象 存储空间不一样
        System.out.println("obj1==obj2"+(obj1==obj2));
    }
}


//具体原型
class Realizetype implements java.lang.Cloneable{
    Realizetype(){
        System.out.println("具体原型创建成功！");
    }
    public Object clone() throws CloneNotSupportedException{
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}