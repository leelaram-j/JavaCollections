package com.java.collections;

import java.util.*;

public class basicMapsImpl {
    public static void linkedmap() {
        SortedMap<String, Integer> map1 = new TreeMap<>();
        map1.put("text",15);
        map1.put("zext",16);
        map1.put("aext",17);
        map1.put("bext",19);
        map1.put("rext",10);
        map1.put("rext",10);
        System.out.println(map1.firstKey());
        System.out.println(map1);

        NavigableMap<String,Integer> map4 = new TreeMap<>();
        map4.put("text",15);
        map4.put("zext",16);
        map4.put("aext",17);
        map4.put("bext",19);
        map4.put("rext",10);
        map4.put("rext",10);
        System.out.println(map4.descendingMap());
        System.out.println(map4.descendingKeySet());

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("text",15);
        map2.put("zext",16);
        map2.put("aext",17);
        map2.put("bext",19);
        map2.put("rext",10);
        map2.put("rext",10);
        System.out.println(map2);

        Map<String,Integer> map3 = new LinkedHashMap<>();
        map3.put("text",15);
        map3.put("zext",16);
        map3.put("aext",17);
        map3.put("bext",19);
        map3.put("rext",10);
        map3.put("rext",10);
        System.out.println(map3);

    }

    public static void main(String[] args) {
        linkedmap();
    }
}
