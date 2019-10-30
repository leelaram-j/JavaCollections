package com.java.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo
{
    private static void lrcCacheTest()
    {
        System.out.println("Inide LRU CacheTest");
        Map<String,String> map2 = new LinkedHashMap<>(16,0.75f,true);
        map2.put("a","A");
        map2.put("b","B");
        map2.put("c","C");
        System.out.println(map2);

        map2.get("a"); //multiple gets to "a" will not make any difference
        map2.get("a");
        map2.get("a");
        System.out.println(map2);
        map2.get("b");
        System.out.println(map2);

        map2.put("d","D");
        System.out.println(map2);

        map2.put("e","E");
        System.out.println(map2);

        System.out.println(map2.size());

        // Testing LRU CAche

        System.out.println("Testing LRU Cache");
        Map<String,String> map3 = new LRUCache<>(16,0.75f,true);
        map3.put("a","A");
        map3.put("b","B");
        map3.put("c","C");
        System.out.println(map3);

        map3.get("a"); //multiple gets to "a" will not make any difference
        map3.get("a");
        map3.get("a");
        System.out.println(map3);
        map3.get("b");
        System.out.println(map3);

        map3.put("d","D");
        System.out.println(map3);

        map3.put("e","E");
        System.out.println(map3);

        System.out.println(map3.size());

    }

    public static void main(String[] args)
    {
        lrcCacheTest();
    }
}

class LRUCache<K,V> extends LinkedHashMap
{
    private static final int MAX_EXTRIES = 3;

    public LRUCache(int initialCapacity,float loadFactor,boolean accessOrder)
    {
        super(initialCapacity,loadFactor,accessOrder);
    }

    //Invoked by put and puAll after inserting a new entry into the map
    public boolean removeEldestEntry(Map.Entry eldest)
    {
        return size() > MAX_EXTRIES;
        //return false;  // same as normal linked hash map.
    }
}