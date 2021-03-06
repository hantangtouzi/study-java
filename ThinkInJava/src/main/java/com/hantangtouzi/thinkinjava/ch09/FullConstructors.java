package com.hantangtouzi.thinkinjava.ch09;

/**
 * @author WenLiang.
 * @date Feb 10, 2017 2:43:35 PM
 */

public class FullConstructors {

	public static void f() throws MyException {
		System.out.println("Throwing MyException form f()");
		throw new MyException();
	}

	public static void g() throws MyException {
		System.out.println("Throwing MyException form g()");
		throw new MyException("Orginate in g()");
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace();
		}

		try {
			g();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}

class MyException extends Exception {
	public MyException() {
	}

	public MyException(String msg) {
		super(msg);
	}
}
