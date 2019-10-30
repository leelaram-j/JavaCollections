package com.java.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo
{
    private static void treeMapDemo()
    {
        System.out.println("\n\nInside TreeMapDemo");
        TreeMap<String,Integer> map1 = new TreeMap<>();
        map1.put("John",23);
        map1.put("ANita",25);
        map1.put("Mike",30);

        System.out.println("Map1 contents:"+map1);

        System.out.println("Iterating through the tree map");
        Set<Map.Entry<String,Integer>> mappings = map1.entrySet();
        for(Map.Entry<String,Integer> mapping:mappings)
        {
            if(mapping.getKey().equals("John"))
            {
                mapping.setValue(40);
            }
            System.out.println("Map key:"+mapping.getKey()+" Map Value:"+mapping.getValue());
        }

        System.out.println("Map1 contents:"+map1);

        // the below will give Unsupported Operation Exception,
        // setValue will work only inside a Iterator as seen above
        //map1.floorEntry("Mike").setValue(22);
    }



    public static void main(String[] args)
    {
        treeMapDemo();
    }
}
