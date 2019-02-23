package com.hantangtouzi.thinkinjava.ch07;

/**
 * @author WilliamChang.
 * Created on 2019-02-23 11:40:02
 */

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride p = new Derived();
        p.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}

