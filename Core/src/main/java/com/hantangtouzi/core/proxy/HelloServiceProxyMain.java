package com.hantangtouzi.core.proxy;

/**
 * @author WilliamChang.
 * Created on 2018/10/7 1:06
 */

public class HelloServiceProxyMain {
    public static void main(String[] args) {
        HelloServiceProxy helloHandler = new HelloServiceProxy();
        HelloService proxy = (HelloService) helloHandler.bind(new HelloServiceImpl());
        proxy.sayHello("zhangsan");
    }
}
