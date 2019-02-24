package com.hantangtouzi.thinkinjava.ch08;

import javax.swing.*;

/**
 * @author WilliamChang.
 * Created on 2019-02-24 14:35:39
 */

class WithInner {
    class Inner {

    }
}

public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner withInner) {
        withInner.super();
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();

        InheritInner ii = new InheritInner(withInner);
    }
}
