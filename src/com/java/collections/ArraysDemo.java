package com.java.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo
{
    private static void sequential()
    {
        // asList
        // List<T> asList(T...)

        String[] strings = new String[]{"Raj","Anitha"};
        List<String> str = Arrays.asList(strings);
        System.out.println("Values in returned list:"+str);

        // In the above case add or remove will throw an error. Unsupported operation error.
//        str.add("a");
//        str.remove(0);

        //Create modifiable ArrayList from an array

        str = new ArrayList(Arrays.asList(strings));
        //Showing varargs
        str= Arrays.asList("Raj","Anita");

        List<String> fixed_list = Arrays.asList(new String[3]);
        //recall from autoboxing that arrays are not auto-boxeable
        //List<Integer> fixed_list1 = new Arrays.asList(new int[2]);
        List<int[]> fixed_list2 = Arrays.asList(new int[2]);
        System.out.println("fixed array list2 size:"+fixed_list2.size());

        // Sorting: void sort(Object[]) - uses merge sort with natural ordering
        // Partially sorted array: far fewer then nlog(n) comparisons
        // Almost sorted array: approx n comparisons, where n is array size

        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        // Additional comments: well suited for merging 2 or more sorted arrays, concatenate
        //                      the arrays and sort the resulting array.

        // Sorting: void sort(int[]) - uses quick sort

        int[] iArray = {23,3,89,55};
        Arrays.sort(iArray);
        System.out.println("Sorted Array:"+Arrays.toString(iArray));

        // Binary Search
        // int binarySearch(int[], int);
        // input array must me sorted, else the behaviour would be undefined.

        System.out.println("Binary Index search results:"+Arrays.binarySearch(new int[] {4,23,59},59));
        System.out.println("Binary Index search results:"+Arrays.binarySearch(new int[] {4,23,59},5));

        // copyOf method copies one array to another array

        int[] newArray = Arrays.copyOf(iArray, 6);
        System.out.println("Copied Array:"+Arrays.toString(newArray));

        int[] newArray1 = new int[6];
        System.arraycopy(iArray,0,newArray1,0,iArray.length);
        System.out.println(" newArray1: "+Arrays.toString(newArray1));

        // Arrays.fill isused to intitalize an array with a single variable
        Arrays.fill(newArray,13);
        System.out.println("new Array after single value inititalization: "+Arrays.toString(newArray));

        //equating 2 arrays
        System.out.println("Equating 2 arrays :"+Arrays.equals(iArray,newArray));

        //Arrays.deepEquals(Object[],Object[]);
        // returns true if arrays are deeply equal to one another
        // Appropriate for nested arrays

        int [][][] deepArray1 = {{{1,2,3},{4,5,6}}};
        int [][][] deepArray2 = {{{1,2,3},{4,5,6}}};

        System.out.println("Deep Array equals ? "+Arrays.deepEquals(deepArray1,deepArray2));

        int [][] deepArray3 = {{1,2,3}};
        int [][] deepArray4 = {{1,2,3}};

        System.out.println("Deep Array equals ? "+Arrays.deepEquals(deepArray3,deepArray4));

        int [] deepArray5 = {1,2,3}; //covariance
        int [] deepArray6 = {1,2,3};
        // Below statement will throw an error because, deepArray5&6 are not multi-dimensional
        //System.out.println("Deep Array equals ? "+Arrays.deepEquals(deepArray5,deepArray6));

        Object[] objArray = new int [][][] {{{1,2,3}}};
        int [][] ia = (int[][])objArray[0];
        System.out.println(ia[0][2]);


        String s1= "this is testing";
        String str1;
        char[] strings24 = s1.toCharArray();
        List<char[]> listf = new ArrayList<>();
                listf=Arrays.asList(strings24);
        System.out.println(listf.toString());
    }

    public static void main(String[] args)
    {
        sequential();
    }
}
