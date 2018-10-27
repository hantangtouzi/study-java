package com.hantangtouzi.thinkinjava.ch04;

/**
 * @author WenLiang
 * @date 2017年1月12日 下午6:32:18
 */

public class Detergent extends Cleanser {

}

class Cleanser {
	private String s = new String("Cleanser");

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");

	}
}
