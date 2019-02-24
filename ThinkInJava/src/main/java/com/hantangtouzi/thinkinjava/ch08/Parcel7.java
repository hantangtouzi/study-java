package com.hantangtouzi.thinkinjava.ch08;

/**
 * @author WilliamChang.
 * Created on 2019-02-24 13:26:32
 */

public class Parcel7 {
    public Wrapping wrap(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();

        Wrapping w = p.wrap(10);

        System.out.println(w.value());
    }
}
