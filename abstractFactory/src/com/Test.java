package com;

public class Test {
    public static void main(String[] args) {
        //这是一个工厂（方法的模式），新加业务，
        // 不需要改动之前的代码，直接新建一个工厂，继承公共的接口，
        //把需要实现的业务放在其中。
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
