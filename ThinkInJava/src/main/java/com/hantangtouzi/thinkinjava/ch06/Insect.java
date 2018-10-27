package com.hantangtouzi.thinkinjava.ch06;

/**
 * @author WenLiang
 * @date Jan 23, 2017 4:24:16 PM
 */

public class Insect {
	private int i = 9;
	protected int j;

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
