package com.IT.ghost;


/**
 * 客户类
 */
public class Client {

    public static void main(String[] args){

        Builder builder = new ConcreteBuilder();

        Director director =  new Director( builder );

        Product product = new Product();

        product.show();
    }
}
