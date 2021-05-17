package com;

/**
 * 饿汉模式的单例  一旦加载就创建一个单例
 */
public class HungryModel {

    private static final HungryModel instance = new HungryModel();

    private HungryModel(){

    }

    public static HungryModel getInstance(){
        return instance;
    }
}
