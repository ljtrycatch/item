package com.IT.ghost;

public  abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void bulidPartA();

    public abstract void bulidPartB();

    public abstract void bulidPartC();

    //返回产品对象

    public Product getProduct(){
        return product;
    }
}
