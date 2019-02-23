package com.hantangtouzi.core.extend;

/**
 * @author WilliamChang.
 * Created on 2019-02-23 11:43:37
 */

public class FatherSonSamMethod {
    private void play() {
        System.out.println("Father play()");
    }

    public static void main(String[] args) {
        System.out.println();

        FatherSonSamMethod f = new Son();
        ((Son)f).play();
    }
}

class Son extends FatherSonSamMethod {
    public void play() {
        System.out.println("Son play()");
    }
}
