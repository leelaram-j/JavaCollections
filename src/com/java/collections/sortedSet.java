package com.java.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSet {

    public static void sortedSet1() {
        SortedSet<String> ns = new TreeSet<>();
        ns.add("monkey");
        ns.add("gog");
        ns.add("bad");
        System.out.println("SortedSet: "+ns);
        System.out.println(ns.first());
        System.out.println(ns.last());
        //headset, subset,tailset

        Set<String> ms = new HashSet<>();
        ms.add("monkey");
        ms.add("gog");
        ms.add("bad");
        System.out.println(ms);

    }

    public static void main(String[] args) {
        sortedSet1();
    }
}
