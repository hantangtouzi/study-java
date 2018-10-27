package com.hantangtouzi.core.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * @author WenLiang.
 * @date Feb 11, 2017 3:25:58 PM
 */

public class GenericTypeTest {

	private Map<String, Integer> map;

	public static void main(String[] args) throws Exception {
		Class<GenericTypeTest> clazz = GenericTypeTest.class;
		Field map = clazz.getDeclaredField("map");
		Class<?> type1 = map.getType();
		System.out.println(type1);

		Type type2 = map.getGenericType();
		System.out.println(type2);

		if (type2 instanceof ParameterizedType) {
			ParameterizedType pType2 = (ParameterizedType) type2;

			Type rType = pType2.getRawType();
			System.out.println(rType);
			Type[] tTypes = pType2.getActualTypeArguments();
			for (Type type : tTypes) {
				System.out.println(type);
			}
		} else {
			System.out.println("获取属性的泛型类型出错了...");
		}

	}

}
