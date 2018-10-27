package com.hantangtouzi.core.proxy;

/**
 * @author WilliamChang.
 * Created on 2018/10/7 1:19
 */

public class HelloServiceCglibMain {
    public static void main(String[] args) {
        HelloServiceCglib helloServiceCglib = new HelloServiceCglib();
        HelloServiceImpl proxy = (HelloServiceImpl) helloServiceCglib.getInstance(new HelloServiceImpl());
        proxy.sayHello("lisi");
//        helloServiceCglib.getInstance(new HelloServiceImpl()).s
//        proxy.sayHello("lisi");
    }
}
