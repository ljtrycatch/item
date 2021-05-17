package com.IT.ghost;

public class PrototypeExcellentStudent {
    public static void main(String[] args) throws CloneNotSupportedException{
    Reward reward1 = new Reward( "张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "韶关学院" );
    reward1.display();
    Reward reward2 = (Reward) reward1.clone();
    reward2.setName( "李四" );
    reward2.display();
}
}

class Reward implements Cloneable {
    String name;
    String info;
    String colloage;

    Reward(String name, String info, String colloage) {
        this.name = name;
        this.info = info;
        this.colloage = colloage;
        System.out.println( "奖状创建成功" );
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void display(){
        System.out.println(name+info+colloage);
    }

    public Object clone() throws CloneNotSupportedException{
        System.out.println("奖状拷贝成功");
        return (Reward)super.clone();
    }

}