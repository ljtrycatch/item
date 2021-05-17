package com.singleModel;

public class SingletonLazy {
    public static void main(String[] args){
        President president = President.getInstance();
        president.getName();  //输出总统的名字
        President president1 = President.getInstance();
        president1.getName();
        if(president == president1){
            System.out.println("他们是同一个人！");
        }else{
            System.out.println("他们不是同一个人！");
        }
    }

}
class President{
    private static  volatile President instance = null; //保正instance在所有线程中同步
    //private  避免类在外部实例化
    private President(){
        System.out.println("产生一个总统");
    }

    public static synchronized President getInstance(){
        if(instance==null){
            instance=new President();
        }else{
            System.out.println("已经有一个总统了，不用产生");
        }
        return instance;
    }
    public void getName(){
        System.out.println("我是美国总统：特朗普");
    }
}