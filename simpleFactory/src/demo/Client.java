package demo;


/**
 * simple factory test.
 */

public class Client {
    public static void main(String[] args) {
        SimpleFactory.makeProduct( 1 ).show();
    }
    //抽象产品
    public interface Product {
        void show();
    }

    //具体产品A
    static class ProductA implements Product{
        public void show(){
            System.out.println("具体产品1显示....");
        }
    }

    //具体产品B
    static class ProductB implements Product{
        public void show(){
            System.out.println("具体产品2显示......");
        }
    }

    final class Const{
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    static class SimpleFactory{
        public static Product makeProduct(int kind){
            switch(kind){
                case Const.PRODUCT_A:
                    return new ProductA();
                    case  Const.PRODUCT_B:
                        return new ProductB();
            }
            return null;
        }
    }

}
