package com.IT.builderModel;


/**
 * @class this is abstract builder: decorator
 * 这是抽象建造者：  工人
 */
public abstract  class Decorator {
//创建产品对象
    protected Parlour product =new Parlour();

    public abstract void buildWall();

    public abstract void buildSofa();

    public abstract void buildWatch();

    //返回产品对象
    public Parlour getResult(){
        return product;
    }
}
