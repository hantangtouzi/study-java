package com.hantangtouzi.thinkinjava.ch09;

/**
 * @author WenLiang.
 * @date Feb 10, 2017 4:03:44 PM
 */

public class LostMessage {

	public static void main(String[] args) throws Exception {
		LostMessage lm = new LostMessage();
		try {
			lm.f();
		} finally {
			lm.dispose();
		}

	}

	void f() throws VeryImportException {
		throw new VeryImportException();
	}

	void dispose() throws HohumException {
		throw new HohumException();
	}

}

class VeryImportException extends Exception {
	public String toString() {
		return "A very import Excetion!";
	}
}

class HohumException extends Exception {
	public String toString() {
		return "A trivial Excetion!";
	}
}
