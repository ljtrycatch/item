package com.IT.ghost;

/**
 * 指挥者  调用建造者中的方法完成复杂对象的创建
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 产品与构造方法组装
     */

    public Product construct(){
        builder.bulidPartA();
        builder.bulidPartB();
        builder.bulidPartC();

        return builder.getProduct();
    }
}
