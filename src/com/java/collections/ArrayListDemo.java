package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListDemo implements Iterable<Integer>
{
    public static List<Integer> listDemo()
    {
        Collection <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(null);
        System.out.println("List 1:"+list1);
        list1.remove(3);
        System.out.println("List 1:"+list1);
        list1.remove(3);
        System.out.println("List 1:"+list1);

        //Collection remove is object specific

        List <Integer> list1_1 = new ArrayList<>();
        list1_1.add(1);
        list1_1.add(2);
        list1_1.add(3);
        list1_1.add(3);
        list1_1.add(null);
        System.out.println("list 1_1="+list1_1);
        list1_1.remove(3);
        System.out.println("list 1_1="+list1_1);
        list1_1.remove(3);
        System.out.println("list 1_1="+list1_1);
        list1_1.add(10);
        System.out.println("list 1_1="+list1_1);
        list1_1.add(0,9);
        System.out.println("list 1_1="+list1_1);
        list1_1.set(0,8);
        System.out.println("list 1_1="+list1_1);

        //List remove is position specific
//

        List<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(3);
        list1_1.removeAll(list2);
        System.out.println("list 1_1="+list1_1);
        list2.add(1);
        list1_1.retainAll(list2);
        System.out.println("list 1_1="+list1_1);
        list1_1.addAll(list2);
        System.out.println("list 1_1="+list1_1);
        System.out.println("list 1_1.set(2,2) is "+list1_1.set(2,2));
        System.out.println("list 1_1="+list1_1);


        //Search functions

        System.out.println("list 1_1.contains(1)="+list1_1.contains(1));
        System.out.println("list 1_1.indexOf(1)="+list1_1.indexOf(1));
        System.out.println("list 1_1.lastIndexOf(1)="+list1_1.lastIndexOf(1));

        //Range-view: sublist, this is backed by the original list. any changes made in the sublist will impact
        // in the original list as well

        List<Integer> list3 = list1_1.subList(2,3);
        System.out.println("List 3:"+list3);
        System.out.println("list 1_1="+list1_1);
        list3.set(0,3);
        System.out.println("List 3:"+list3);
        System.out.println("list 1_1="+list1_1);
        list3.add(0,7);
        System.out.println("List 3:"+list3);
        System.out.println("list 1_1="+list1_1);

        //Changes made in list 1_1 will reflect in list 3 as well.

        list1_1.set(2,9);
        System.out.println("List 3:"+list3);
        System.out.println("list 1_1="+list1_1);
        // now when we try to add an element to list 3 we will get concurrent modification exception
        //i.e only non structural changes are allowed to list 1 as it will impact list 3
        //list1_1.add(0,5);
        //System.out.println("List 3:"+list3);
        System.out.println("list 1_1="+list1_1);

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

    public static void iteratorDemo(List<Integer> list1)
    {
        System.out.println("entering iterator Demo function");
        Iterator<Integer> iterator = list1.iterator();
        System.out.println("list 1 before removal is "+list1);
        while(iterator.hasNext())
        {
            int element = iterator.next();
            System.out.println("element==" +element);
            if(element ==9)
            {
                iterator.remove();
                iterator.forEachRemaining(Filter::add);
            }
        }
        System.out.println("list 1 after removal is "+list1);
        System.out.println("exiting iterator Demo function");

        //list1.forEach(System.out::println); ClassName::function_name
        //list1.forEach(Filter::filter);
        //  list1.forEach(new Filter());
    }

    public static void main(String[] args)
    {

        List<Integer> list1 = listDemo();
        iteratorDemo(list1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayList().iterator();
    }
}

class Filter implements Consumer
{
    static void filter(Integer i)
    {
        if((int) i==1)
        {
            System.out.println(i);
        }
    }

    @Override
    public void accept(Object i) {
        if((int) i==1)
        {
            System.out.println(i);
        }
    }

    static void add(Integer i)
    {
        System.out.println(i +7);
    }
}