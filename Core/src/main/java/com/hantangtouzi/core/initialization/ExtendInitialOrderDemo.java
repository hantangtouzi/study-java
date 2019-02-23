package com.hantangtouzi.core.initialization;

/**
 * @author WilliamChang.
 * Created on 2019-02-23 12:10:00
 */

public class ExtendInitialOrderDemo extends PortableLunch {
    private Bread bread = new Bread();

    ExtendInitialOrderDemo() {
        System.out.println("ExtendInitialOrderDemo constructor");
    }

    public static void main(String[] args) {
        new ExtendInitialOrderDemo();
    }
}

class Meal {
    Meal() {
        System.out.println("Meal constructor");
    }

    private Bread bread = new Bread("Meal                    ");
}

class Bread {
    Bread() {
        System.out.println("Bread constructor");
    }

    Bread(String type) {
        System.out.println(type + " Bread constructor");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch constructor");
    }

    private Bread bread = new Bread("Lunch                    ");
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch constructor");
    }
}



