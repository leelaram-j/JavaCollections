package com.java.collections;

import java.util.*;
import java.util.function.Consumer;

public class LinkedListDemo {
    public static List<Integer> listDemo() {
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(null);
        System.out.println("List 1:" + list1);
        list1.remove(3);
        System.out.println("List 1:" + list1);
        list1.remove(3);
        System.out.println("List 1:" + list1);

        //Collection remove is object specific

        List<Integer> list1_1 = new ArrayList<>();
        list1_1.add(1);
        list1_1.add(2);
        list1_1.add(3);
        list1_1.add(3);
        list1_1.add(null);
        System.out.println("list 1_1=" + list1_1);
        list1_1.remove(3);
        System.out.println("list 1_1=" + list1_1);
        list1_1.remove(3);
        System.out.println("list 1_1=" + list1_1);
        list1_1.add(10);
        System.out.println("list 1_1=" + list1_1);
        list1_1.add(0, 9);
        System.out.println("list 1_1=" + list1_1);
        list1_1.set(0, 8);
        System.out.println("list 1_1=" + list1_1);

        //List remove is position specific
//

        List<Integer> list2 = new LinkedList<>();
        list2.add(8);
        list2.add(3);
        list1_1.removeAll(list2);
        System.out.println("list 1_1=" + list1_1);
        list2.add(1);
        list1_1.retainAll(list2);
        System.out.println("list 1_1=" + list1_1);
        list1_1.addAll(list2);
        System.out.println("list 1_1=" + list1_1);
        System.out.println("list 1_1.set(2,2) is " + list1_1.set(2, 2));
        System.out.println("list 1_1=" + list1_1);


        //Search functions

        System.out.println("list 1_1.contains(1)=" + list1_1.contains(1));
        System.out.println("list 1_1.indexOf(1)=" + list1_1.indexOf(1));
        System.out.println("list 1_1.lastIndexOf(1)=" + list1_1.lastIndexOf(1));

        //Range-view: sublist, this is backed by the original list. any changes made in the sublist will impact
        // in the original list as well

        List<Integer> list3 = list1_1.subList(2, 3);
        System.out.println("List 3:" + list3);
        System.out.println("list 1_1=" + list1_1);
        list3.set(0, 3);
        System.out.println("List 3:" + list3);
        System.out.println("list 1_1=" + list1_1);
        list3.add(0, 7);
        System.out.println("List 3:" + list3);
        System.out.println("list 1_1=" + list1_1);

        //Changes made in list 1_1 will reflect in list 3 as well.

        list1_1.set(2, 9);
        System.out.println("List 3:" + list3);
        System.out.println("list 1_1=" + list1_1);
        // now when we try to add an element to list 3 we will get concurrent modification exception
        //i.e only non structural changes are allowed to list 1 as it will impact list 3
        //list1_1.add(0,5);
        //System.out.println("List 3:"+list3);
        System.out.println("list 1_1=" + list1_1);

//        for(int element: list1_1 )//new ArrayListDemo())
//        {
//            System.out.println("element: "+element);
//            if(element==9)
//            {
//                list1_1.remove(Integer.valueOf(element));
//            }
//        }

        return list1_1;
    }


    public static void main(String[] args) {

        List<Integer> list1 = listDemo();
        //iteratorDemo(list1);
    }

}
