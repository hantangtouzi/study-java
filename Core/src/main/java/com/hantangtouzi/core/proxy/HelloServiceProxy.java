package com.hantangtouzi.core.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author WilliamChang.
 * Created on 2018/10/7 0:57
 */

public class HelloServiceProxy implements InvocationHandler {
    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("--------------我是JDK动态代理--------------");
        Object result = null;
        System.err.println("我准备说Hello");
        result = method.invoke(target, args);
        System.err.println("我已说过Hello");

        return result;
    }
}
