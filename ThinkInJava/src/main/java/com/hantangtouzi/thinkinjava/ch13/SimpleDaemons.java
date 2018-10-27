package com.hantangtouzi.thinkinjava.ch13;

/**
 * @author WenLiang.
 * @created May 28, 2017 5:01:03 PM
 */

public class SimpleDaemons extends Thread {
	public SimpleDaemons() {
		setDaemon(true);
		start();
	}

	public void run() {
		while (true) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				throw new RuntimeException();
			}

			System.out.println(this);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new SimpleDaemons();
		}
	}
}
