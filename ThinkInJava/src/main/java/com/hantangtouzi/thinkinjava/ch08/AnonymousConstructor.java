package com.hantangtouzi.thinkinjava.ch08;

/**
 * @author WilliamChang.
 * Created on 2019-02-24 13:06:02
 */

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer" + i);
            }

            @Override
            public void f() {
                System.out.println("In anonymous f()" +  i);
            }


        };
    }

    public static Base getBase(final String s) {
        return new Base(s) {
            {
                System.out.println("Inside instance initializer " + s);
            }

            @Override
            public void f() {
                System.out.println("In anonymous f() " +  s);
            }


        };
    }

    public static void main(String[] args) {
        Base base = getBase("sss");
        base.f();
    }
}

abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }

    public Base(String s) {
        System.out.println("Base constructor, s = " + s);
    }

    public abstract void f();
}
