package com.java.collections;

import java.util.*;

public class MapDemoImmutableKeys
{
    private static void immutableKeysDemo()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        Map<List<Integer>,Integer> map1 = new HashMap<>();
        map1.put(list,1);
        System.out.println("Map1 before list data insertion "+map1.get(list));

        list.add(2);
        System.out.println("Map1 after list data insertion "+map1.get(list));

        System.out.println("Implementation using Class Object");

        Student s = new Student(1,null);

        Map<Student,Integer> map2 = new HashMap<>();
        map2.put(s,1);
        System.out.println("Map2 values are "+map2.get(s));

        s.setName("John");

        //Object memory address is used in the next statement, hasCode and equals methods are not used.
        System.out.println("Map2 values after Student class updation-mutable keys-are "+map2.get(s));


    }



    public static void main(String[] args)
    {
       immutableKeysDemo();
    }
}

class Student
{
    int id;
    String name;

    public Student(int id, String name)
    {
        super();
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
