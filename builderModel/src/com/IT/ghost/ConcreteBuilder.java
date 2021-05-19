package com.IT.ghost;

public class ConcreteBuilder extends Builder {

    @Override
    public void bulidPartA(){
        product.setPartA( "建造者partA" );
    }

    @Override
    public void bulidPartB(){
        product.setPartB( "建造者partB" );
    }

    @Override
    public void bulidPartC(){
        product.setPartC("建造者partC");
    }
}
