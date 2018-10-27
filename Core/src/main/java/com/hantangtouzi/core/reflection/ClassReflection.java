package com.hantangtouzi.core.reflection;

/**
 * @author WenLiang.
 * @date Feb 11, 2017 2:26:32 PM
 */

public class ClassReflection {

	public static void main(String[] args) {
		Class clazz1 = String.class;
		Class clazz2 = "String".getClass();
		Class clazz3 = null;
		try {
			clazz3 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(clazz1.getName());
		System.out.println(clazz2.getName());
		System.out.println(clazz3.getName());
	}

}
