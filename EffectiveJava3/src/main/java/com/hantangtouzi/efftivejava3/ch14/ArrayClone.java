package com.hantangtouzi.efftivejava3.ch14;

import java.util.Arrays;

/**
 * @author WilliamChang.
 * Created on 2019-08-18 01:08:43
 */

public class ArrayClone {
    public static void main(String[] args) {
        // String[] a = new String[]{"a", "b", "c"};
        String[] a = {"a", "b", "c"};
        String[] b = a.clone();
        System.out.println(Arrays.equals(a, b));
        System.out.println(b == a);
        System.out.println(a);
        System.out.println(b);
    }
}
