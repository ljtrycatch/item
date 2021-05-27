package com.IT.builderModel;

/**
 * 具体建造者  具体装修工人1
 */
public class ConcreteDecorator1 extends Decorator{

    @Override
    public void buildWall(){
        product.setWall( "wl" );
    }

    @Override
    public void buildSofa(){
        product.setSofa( "sofa" );
    }

    @Override
    public void buildWatch(){
        product.setWatch( "TV" );
    }


}
