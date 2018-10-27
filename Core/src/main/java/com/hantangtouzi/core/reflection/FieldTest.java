package com.hantangtouzi.core.reflection;

import java.lang.reflect.Field;

/**
 * @author WenLiang.
 * @date Feb 11, 2017 2:45:00 PM
 */

public class FieldTest {
	private Long id = 1l;
	public String name = "zhangsan";
	protected int age = 20;

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class clazz = FieldTest.class;

		FieldTest fieldTest = new FieldTest();

		Field id = clazz.getDeclaredField("id");
		System.out.println(id.get(fieldTest));

		Field name = clazz.getField("name");
		System.out.println(name.get(fieldTest));

		Field age = clazz.getDeclaredField("age");
		System.out.println(age.get(fieldTest));
	}

}
