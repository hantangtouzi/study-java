package com.hantangtouzi.thinkinjava.ch11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WenLiang.
 * @date Feb 13, 2017 11:29:44 PM
 */

public class InfiniteRecursion {

	public static void main(String[] args) {
		List v = new ArrayList();
		for (int i = 0; i < 10; i++) {
			v.add(new InfiniteRecursion());
		}
		System.out.println(v);
	}

	public String toString() {
		return "InfiniteRecursion address: " + super.toString() + "\n";
	}

}
