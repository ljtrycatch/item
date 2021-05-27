package com.IT.builderModel;

/**
 * 具体建造者： 装修工人2
 */
public class ConcreteDecorator2 extends Decorator{

    @Override
    public void buildWall(){
        product.setWall("wl2");
    }

    @Override
    public void buildWatch(){
        product.setWatch( "TV2" );
    }

    @Override
    public void buildSofa(){
        product.setSofa( "sofa2" );
    }
}
