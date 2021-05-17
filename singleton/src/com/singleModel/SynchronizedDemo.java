package com.singleModel;

public class SynchronizedDemo {

    public synchronized void f(){
        //同步方法
        System.out.println("Hello World");
    }

    public void g(){
        synchronized(this){
            //这是同步代码块的
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        synchronizedDemo.f();
        synchronizedDemo.g();
    }
}
