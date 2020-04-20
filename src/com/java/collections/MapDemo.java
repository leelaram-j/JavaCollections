package com.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo
{
    private static void hashMapDemo()
    {
        System.out.println("Inside HashMap Demo");
        Map<String,Integer> map1= new HashMap<>();
        map1.put("John",23);
        map1.put("Alex",30);
        map1.put("Yankee",null);
        map1.put("Donkey",22);
        map1.put(null,22);

        System.out.println("Hash Map values:"+map1);

        map1.put("Yankee",35);
        System.out.println("Hash Map values:"+map1);

        System.out.println("Contains John:"+map1.containsKey("John"));
        System.out.println("John's Age:"+map1.get("John"));

        System.out.println("\nIterating using KeySet");
        Set<String> names = map1.keySet();
        for(String name:names)
        {
            System.out.println("Name:"+name+" Age:"+map1.get(name));
        }

        //Better way of Iterating is below one, since if many keys are mapped to a bucket then the above
        //method will be costly as it consumes some more time

        System.out.println("\nIterating using EntrySet");
        Set<Map.Entry<String,Integer>> mappings = map1.entrySet();
        for(Map.Entry<String,Integer> mapping:mappings)
        {
            System.out.println("Name:+"+mapping.getKey()+" Age:"+mapping.getValue());
        }
        System.out.println("\nIterating using Streams");
        mappings.stream().forEach(s->System.out.println("Name:"+s.getKey()+" Age:"+s.getValue()));
        mappings.stream().filter(s->s.getValue().toString().startsWith("Y")).count();

        //While iterating using KeySet the derived set is backed by the original, So
        names.remove("Donkey");
        System.out.println("\nHash Map values after removing donkey:"+map1);


        //Creating complicated Maps

        Map<String,Map<String,Object>> userProfile = new HashMap<>();
        Map<String,Object> profile = new HashMap<>();
        profile.put("Age",25);
        profile.put("Dept","CS");
        profile.put("City","Chennai");

        userProfile.put("Mike",profile);


        profile.put("Age",30);
        profile.put("Dept","CS");
        profile.put("City","Mumbai");
        userProfile.put("Charlie",profile);

        System.out.println("\nUser Profiles: "+userProfile);

        Map<String,Object> profile1 = userProfile.get("Mike");
        int age = (Integer) profile1.get("Age");
        System.out.println("Mike Age:"+age);

        //Exercise: try using second constructor,putAll,clear,values,other methods

    }

    public static void main(String[] args)
    {
        hashMapDemo();
    }
}
