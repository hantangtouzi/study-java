package com.hantangtouzi.thinkinjava.ch10;

/**
 * @author WenLiang.
 * @date Feb 13, 2017 11:00:27 AM
 */

public class ToyTest {

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		Class[] faces = c.getInterfaces();
		for (int i = 0; i < faces.length; i++) {
			printInfo(faces[i]);
		}
		Class cy = c.getSuperclass();
		Object o = null;
		try {
			cy.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(o.getClass());
	}

	static void printInfo(Class cc) {
		System.out.println("Class name: " + cc.getName() + " is interface?[" + cc.isInterface() + "]");
	}

}

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	Toy() {
	}

	Toy(int i) {
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	public FancyToy() {
		super(1);
	}
}