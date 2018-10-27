package com.hantangtouzi.core.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author WenLiang.
 * @date Feb 14, 2017 2:36:13 PM
 */

public class CollectionTest {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();

		collection.add("1");
		collection.add("2");
		collection.add("3");
		collection.add("4");

		Object[] objects = collection.toArray();
		for (int i = 0; i < objects.length; i++) {
			Object object = objects[i];
			System.out.println(object);
		}
	}

}
