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

        String[] stf = list.toArray(new String[list.size()]);
        Arrays.stream(stf).forEach(s->System.out.println(s));

        System.out.println("before sorting list:"+list);
        Collections.sort(list);
        System.out.println("\nAfter sorting list:"+list);

        String[] array = {"Anita"};
        //list = Arrays.asList(array);
        Collections.addAll(list,array);
        System.out.println("\nBefore aorting list:"+list);
        Collections.sort(list);
        System.out.println("\nAfter Sorting list:"+list);
        System.out.println("position="+Collections.binarySearch(list,"Raj"));


        // Converting array to set
        /*
        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(array));
        */

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

        System.out.println("-----------------------------------------------------------------------------");

        String s = "this is new string";
        List<Character> chr = new ArrayList<>();
        for(char ch: s.toCharArray()) {
            chr.add(ch);
        }
        Collections.reverse(chr);
        System.out.println(chr);
        String[] str = chr.toArray(new String[chr.size()]);
        Arrays.stream(str).forEach(s23->System.out.print(s23));







    }
}
