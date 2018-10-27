package com.hantangtouzi.core.exception;

import java.io.IOException;

/**
 * @author WenLiang.
 * @date Feb 10, 2017 1:43:00 PM
 */

public class TestException {

	public static void main(String[] args) {
		int i = 0;
		String[] greetings = { "Hello world!", "Hello World", "Hello WORLD!" };

		while (i < 4) {
			try {
				System.out.println(greetings[i++]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("数组下标越界！");
			} finally {
				System.out.println("程序运行结束------------");
			}
		}
	}

	void method1() throws IOException {
	};

	void method6() {
		try {
			method1();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

}
