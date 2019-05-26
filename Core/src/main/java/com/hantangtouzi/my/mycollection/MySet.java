package com.hantangtouzi.my.mycollection;

import java.util.*;

/**
 * @author WilliamChang.
 * Created on 2019-05-2019/5/26 12:54:44
 */

public class MySet {
    public static void main(String[] args) {
        // Set<String> set = new HashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("S111");
        set.add("S444");
        set.add("S777");
        set.add("S666");

        List<String> list = new ArrayList<>();
        list.addAll(set);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
