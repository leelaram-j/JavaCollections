package com.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo
{
    private static void linkedHashSetDemo()
    {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Raj");
        hashSet.add("Kumar");
        hashSet.add("Priya");
        // Here insertion sequence will not be preserved
        System.out.println("HashRSet:"+hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Raj");
        linkedHashSet.add("Kumar");
        linkedHashSet.add("Priya");
        //Here insertion sequence will be preserved
        System.out.println("LinkedHashSet: "+linkedHashSet);

    }

    public static void main(String[] args)
    {
        linkedHashSetDemo();
    }
}
