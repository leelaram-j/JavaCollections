package com.java.collections;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableTreeSetDemo
{
    private static void navigableSetDemo()
    {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(4);
        set.add(30);
        set.add(50);
        set.add(2);

        System.out.println("lower: "+set.lower(30));
        System.out.println("ceiling: "+set.ceiling(30));
        System.out.println("higher: "+set.higher(30));
        System.out.println("floor: "+set.floor(30));

        System.out.println("first: "+set.first());
        System.out.println("last: "+set.last());

        System.out.println("set elements: "+set);

        NavigableSet<Integer> set1 = set.descendingSet();
        System.out.println("Descending order set elements: "+set1);

        NavigableSet<Integer> set2 = set.headSet(30,true);
        System.out.println("Head set elements: "+set2);

        set2.add(25);
        System.out.println("Head set elements: "+set2);
        System.out.println("set elements: "+set);

        //set2.add(51);// adding this will through Illegal Argument Exception
        System.out.println("Head set elements: "+set2);
        System.out.println("set elements: "+set);

        SortedSet<Integer> set3 = set.subSet(4,30);
        //set3.add(35); // this will also throw an run time exception, Illegal argument Exception

        set.add(23);
        System.out.println("Sorted Sub Set: "+set3 );

    }

    public static void main (String[] args)
    {
        navigableSetDemo();
    }
}
