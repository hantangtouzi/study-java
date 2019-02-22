package com.hantangtouzi.core.initialization;

/**
 * @author WilliamChang.
 * Created on 2019-02-22 16:20:25
 */

public class FieldInitialOrderDemo {

    private static int i = print();

    public static void main(String[] args) {
        System.out.println("Test");
    }

    private static int print() {
        System.out.println("Print——————");
        return 1;
    }
}
