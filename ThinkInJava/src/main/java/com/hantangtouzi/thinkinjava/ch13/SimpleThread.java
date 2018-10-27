package com.hantangtouzi.thinkinjava.ch13;

/**
 * @author WilliamChang.
 * @created on May 28, 2017 11:29:48 AM
 */

public class SimpleThread extends Thread {
	private int countDown = 5;
	private static int threadCount = 0;

	public SimpleThread() {
		super("" + ++threadCount);
		start();
	}

	public String toString() {
		return "#" + getName() + ": " + countDown;
	}

	public void run() {
		while (true) {
			System.out.println(this);
			if (--countDown == 0) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new SimpleThread();
		}
	}

}
