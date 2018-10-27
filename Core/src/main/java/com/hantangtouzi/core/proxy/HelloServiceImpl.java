package com.hantangtouzi.core.proxy;

/**
 * @author WilliamChang.
 * Created on 2018/10/7 0:55
 */

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.err.println("hello " + name);
    }
}
