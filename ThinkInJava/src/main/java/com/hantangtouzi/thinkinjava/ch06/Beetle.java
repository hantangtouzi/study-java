package com.hantangtouzi.thinkinjava.ch06;

/**
 * @author WenLiang
 * @date Jan 23, 2017 4:23:53 PM
 */

public class Beetle extends Insect {
	private int k = print("Beetle.k initialized");

	public Beetle() {
		// System.out.println("k = " + k);
		// System.out.println("j = " + j);
		print("beetle");
	}

	private static int x2 = print("static Beetle.x2 initialized");

	public static void main(String[] args) {
		System.out.println("Beetle constructor");
		Beetle b = new Beetle();

	}

	static int i = print("i");
}

class Insect {
	private int i = 9;
	private int j = print("j");

	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}

	private static int x1 = print("static Insect.x1 initialized");

	static int print(String s) {
		System.out.println(s);
		return 47;
	}

}
