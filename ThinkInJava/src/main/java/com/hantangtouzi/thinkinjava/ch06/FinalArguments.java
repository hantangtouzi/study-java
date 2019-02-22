package com.hantangtouzi.thinkinjava.ch06;

/**
 * @author WilliamChang.
 * Created on 2019-02-22 18:05:31
 */

public class FinalArguments {
    public static void main(String[] args) {
        FinalArguments fa = new FinalArguments();
        fa.without(null);
        fa.with(null);
    }

    void with(final Gizmo gizmo) {
        Gizmo g = gizmo;
        g = new Gizmo();
        // gizmo = new Gizmo();
    }

    void without(Gizmo gizmo) {
        gizmo = new Gizmo();
        gizmo.spin();
    }
}

class Gizmo {
    public void spin() {

    }
}