package com.hantangtouzi.thinkinjava.ch13;

/**
 * @author WenLiang.
 * @date May 28, 2017 1:16:10 PM
 */

public class YieldingThread extends Thread {

	private int countDown = 5;

	private static int threadCount = 0;

	public YieldingThread() {
		super("" + ++threadCount);
		start();
	}

	@Override
	public String toString() {
		return "#" + getName() + ": " + countDown;
	}

	public void run() {
		while (true) {
			System.out.println(this);
			if (--countDown == 0) {
				return;
			}
			yield();
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new YieldingThread();
		}
	}

}
