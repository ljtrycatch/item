package com;
/**
 * 单例模式,懒汉吧模式
 */
public class Singleton {
    //持有私有的静态实例，防止被引用，此处赋值为null，目的实现延迟加载。
    public static Singleton instance = null;

    //私有的构造方法，避免类在外部被实例化
    private Singleton(){

    }

    //静态工厂方法，创建实例,加synchronizaed关键字保证线程的安全。
    public static synchronized Singleton getInstance(){
        //方法前加同步  getInstance
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    //如果对象被序列化，可以保证序列化前后保持一致
    public Object readResolve(){
        return instance;
    }

}
