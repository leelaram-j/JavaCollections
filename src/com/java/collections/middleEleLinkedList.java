package com.java.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class middleEleLinkedList {
    public static void main(String[] args) {
        int[] a = {4,5,5,7,56,76};
        List<Integer> at = new LinkedList<>();
        at.add(4);
        at.add(5);
        at.add(5);
        at.add(7);
        at.add(56);
        at.add(76);
        //at.add(9);

        int n;
        if(at.size() % 2 == 0)
            n=at.get((at.size()/2));
        else
            n= at.get((at.size()/2) + 1);

        System.out.println(at.size());
        System.out.println(n);
    }
}
