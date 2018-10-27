package com.hantangtouzi.core.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author WilliamChang.
 * Created on 2018/10/7 1:12
 */

public class HelloServiceCglib implements MethodInterceptor {
    /*private Enhancer enhancer = new Enhancer();

    public Object getInstance(Class c) {
        enhancer.setSuperclass(c);
        enhancer.setCallback(this);
        return enhancer.create();
    }*/

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.err.println("--------------我是Cglib动态代理--------------");
        Object result = null;
        System.err.println("我准备说Hello");
        result = methodProxy.invokeSuper(o, objects);
        System.err.println("我已说过Hello");
        return result;
    }
}
