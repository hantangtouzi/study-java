package com.hantangtouzi.thinkinjava.ch09;

/**
 * @author WenLiang.
 * @date Feb 10, 2017 3:04:25 PM
 */

public class ThrowOut {

	public static void main(String[] args) throws Throwable {
		try {
			throw new Throwable();
		} catch (Exception e) {
			System.err.println("Caught in main()");
		}
	}

}
