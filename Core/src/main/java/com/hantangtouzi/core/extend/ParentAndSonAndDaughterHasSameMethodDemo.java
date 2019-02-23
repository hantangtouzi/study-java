package com.hantangtouzi.core.extend;

/**
 * @author WilliamChang.
 * Created on 2019-02-23 11:01:32
 */

public class ParentAndSonAndDaughterHasSameMethodDemo {
    public static void main(String[] args) {
        ParentHasSameMethod p = new SonHasSameMethod();
        p.play();
    }
}


class ParentHasSameMethod{
    public void play() {
        System.out.println("parent play");
    }
}

class SonHasSameMethod extends ParentHasSameMethod {
    public void play() {
        System.out.println("son play");
    }
}