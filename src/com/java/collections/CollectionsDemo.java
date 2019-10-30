package com.java.collections;

import java.util.*;

public class CollectionsDemo
{
    public static void main(String[] args)
    {
        // boolena addAdll(Collectoin<? super T> c, T... elements);
        List<String> list = new ArrayList<>();
        list.add("Raj");
        list.add("JOhn");
        list.add("JOhn");

        System.out.println("before sorting list:"+list);
        Collections.sort(list);
        System.out.println("\nAfter sorting list:"+list);

        String[] array = {"Anita"};
        Collections.addAll(list,array);
        System.out.println("\nBefore aorting list:"+list);
        Collections.sort(list);
        System.out.println("\nAfter Sorting list:"+list);


//        list.addAll(Arrays.asList(array));
//        System.out.println("\nAdding an array to a list:"+list);
//        Collections.sort(list);

        // static <T extends Comparable<? super T>> void sort(List<t> list)

        // <T> int binarySearch(<List? extends Comparable<? super T>> list,T key)
        // Needs to be sorted. 0(log(n)).

        List<String> list2 = new ArrayList<>();
        list2.addAll(list);
                Collections.reverse(list2);
        System.out.println("Reverse order in list:"+list2);

        System.out.println("Is john present ? "+Collections.binarySearch(list,"JOhn"));

        Collections.swap(list,0,3);
        System.out.println("\nList after swapping:"+list);

        System.out.println("\nNumber of times John is repeated is "+Collections.frequency(list,"JOhn"));

        System.out.println("\nMax:"+Collections.max(list));
        System.out.println("\nMin:"+Collections.min(list));
        Collections.shuffle(list);
        System.out.println("\n Shuffle list:"+list);

        list.removeAll(Collections.singletonList("JOhn"));
        System.out.println("\n List after singleton:"+list);

    }
}
