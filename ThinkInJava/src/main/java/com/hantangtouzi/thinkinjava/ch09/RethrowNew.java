package com.hantangtouzi.thinkinjava.ch09;

/**
 * @author WenLiang.
 * @date Feb 10, 2017 3:11:47 PM
 */

public class RethrowNew {
	public static void main(String[] args) throws TwoExcetion {
		try {
			f();
		} catch (OneExcetion e) {
			System.err.println("Caught in main(), e.printStackTrace()");
			e.printStackTrace();
			throw new TwoExcetion("from main");
		}
	}

	private static void f() throws OneExcetion {
		System.out.println("orginate OneExcetion form f()");
		throw new OneExcetion("thrown from f()");
	}
}

class OneExcetion extends Exception {
	public OneExcetion(String msg) {
		super(msg);
	}
}

class TwoExcetion extends Exception {
	public TwoExcetion(String msg) {
		super(msg);
	}
}
