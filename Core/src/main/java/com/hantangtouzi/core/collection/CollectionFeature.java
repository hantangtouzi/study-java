package com.hantangtouzi.core.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author WilliamChang.
 * Created on 2018/9/2 15:37
 */

public class CollectionFeature {
    public static void main(String[] args) {
        Collection collection = new ArrayList<String>();
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
