package demo.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args){
        try{
            Product a;
            AbstractFactory abstractFactory;
            abstractFactory = (AbstractFactory) ReadXML1.getObject();
            a = abstractFactory.newProduct();
            a.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}

//抽象产品
interface Product{
    public void show();
}

class ProductA implements Product{
    @Override
    public void show(){
        System.out.println("具体产品ProductA显示..");
    }
}

class ProductB implements Product{
    @Override
    public void show(){
        System.out.println("具体产品ProductB显示..");
    }
}

//抽象工厂
interface AbstractFactory{
    public Product newProduct();
}

class FactoryA implements  AbstractFactory{
    @Override
    public Product newProduct(){
        System.out.println("具体工厂A产生--》具体产品A");
        return new ProductA();
    }
}

class FactoryB implements AbstractFactory{
    @Override
    public Product newProduct(){
        System.out.println("具体工厂B产生--》具体产品B");
        return new ProductB();
    }
}