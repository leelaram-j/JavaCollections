package com.java.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackUsingLinkedList {

    public static void main(String[] args) {
        List<Integer> stack = new LinkedList<>();
        ((LinkedList<Integer>) stack).push(25);
        ((LinkedList<Integer>) stack).push(35);
        ((LinkedList<Integer>) stack).push(45);
        System.out.println(stack);
        ((LinkedList<Integer>) stack).pop();
        System.out.println(stack);

        Stack stk = new Stack();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push("temp");
        System.out.println(stk);
        System.out.println(stk.peek());
        int n = stk.search(40);
        while(!stk.isEmpty())
        {
            System.out.println(stk.pop());
        }
        System.out.println(n);



    }
}
