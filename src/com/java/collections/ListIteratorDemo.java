package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo
{
    static void listIteratorDemo()
    {
        System.out.println("\n inside List Iterator Demo");
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        System.out.println(" Displaying current elements:");
        for(ListIterator<String> iterator = list1.listIterator();iterator.hasNext();)
        {
            System.out.println("iterator.nextIndex: "+iterator.nextIndex() + ", iterator.next: "+iterator.next());
        }

        System.out.println("\n using add,remove and set operations in listIterator");

        for(ListIterator<String> iterator = list1.listIterator();iterator.hasNext();)
        {
            System.out.println("iterator.nextIndex: "+iterator.nextIndex() + ", iterator.next: "+iterator.next());
            if(iterator.nextIndex() ==1)
            {
                System.out.println("*** Adding test at index 1");
                iterator.add("test");
                System.out.println("iterator.nextIndex: "+iterator.nextIndex() + ", iterator.next: "+iterator.next());

                System.out.println("Removing test word tat was added in position 1");
                iterator.previous();
                iterator.previous();
                iterator.remove();

                //iterator.set("test");
                System.out.println("iterator.nextIndex: "+iterator.nextIndex() + ", iterator.next: "+iterator.next());
                System.out.println("Setting element at index 1 as test");
                iterator.set("test");
                System.out.println("Setting element at index 1 as test1 to show that the two operations are working" +
                        "fine ");
                iterator.set("test1");

            }
        }

        System.out.println(" Displaying current elements:");
        for(ListIterator<String> iterator = list1.listIterator();iterator.hasNext();)
        {
            System.out.println("iterator.nextIndex: "+iterator.nextIndex() + ", iterator.next: "+iterator.next());
        }

    }

    public static void main(String [] args)
    {
        listIteratorDemo();
    }
}
