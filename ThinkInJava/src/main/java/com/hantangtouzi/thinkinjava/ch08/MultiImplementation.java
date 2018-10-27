package com.hantangtouzi.thinkinjava.ch08;

/**
 * @author WenLiang.
 * @date Feb 10, 2017 12:13:44 PM
 */

public class MultiImplementation {
	static void takesD(D d) {
	}

	static void takesE(E e) {
	}

	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}

class D {
}

abstract class E {
}

class Z extends D {
	E makeE() {
		return new E() {
		};
	}
}
