package com.hantangtouzi.thinkinjava.ch11;

import java.util.Random;

/**
 * @author WenLiang.
 * @date Feb 13, 2017 10:08:24 PM
 */

public class IceCream {

	private static Random random = new Random();

	public static final String[] flavors = { "Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip", "Mocha Almond Fudge", "Rum Raisin", "Praline Cream",
			"Mud Pie" };

	public static String[] favorSet(int n) {
		String[] results = new String[n];
		boolean[] picked = new boolean[flavors.length];
		for (int i = 0; i < n; i++) {
			int t;
			do
				t = random.nextInt(flavors.length);
			while (picked[t]);
			results[i] = flavors[t];
			picked[t] = true;
		}
		return results;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println("flavorSet(" + i + ")=");
			String[] fl = favorSet(flavors.length);
			for (int j = 0; j < fl.length; j++) {
				System.out.println("\t" + fl[j]);
			}
		}
	}

}
