package com.hantangtouzi.core.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2018/9/2 15:37
 */

public class CollectionFeature {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello World!");
        for (Object o : list) {
            System.out.println(o);
        }

        Collection c = new HashSet();
    }
}
