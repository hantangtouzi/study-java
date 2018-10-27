package com.hantangtouzi.thinkinjava.ch09;

/**
 * @author WenLiang.
 * @date Feb 10, 2017 2:32:47 PM
 */

public class SimpleExceptionDemo {

	public void f() throws SimpleException {
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		SimpleExceptionDemo sed = new SimpleExceptionDemo();
		try {
			sed.f();
		} catch (SimpleException e) {
			System.err.println("Caught it!");
			e.printStackTrace();
		}
	}

}

class SimpleException extends Exception {
}
