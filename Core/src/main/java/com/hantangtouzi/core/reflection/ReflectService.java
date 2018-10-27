package com.hantangtouzi.core.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author WilliamChang.
 * Created on 2018/10/7 0:48
 */

public class ReflectService {
    public void sayHello(String name) {
        System.err.println("hello " + name);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Object service = Class.forName(ReflectService.class.getName()).newInstance();
        Method method = service.getClass().getMethod("sayHello", String.class);
        method.invoke(service, "zhangsan");
    }
}
