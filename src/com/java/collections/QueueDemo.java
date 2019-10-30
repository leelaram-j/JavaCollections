package com.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo
{
    private static void dequeTest()
    {
        System.out.println("Inside DequeTest");

        //Queue-FIFO
        Deque<String> deque = new ArrayDeque<>();
        deque.add("walden");
        deque.add("harry potter");
        deque.add("head first java");

        System.out.println("Printing Queue ..");
        System.out.println(deque.remove()); //removeFirst
        System.out.println(deque.remove());
        System.out.println(deque.remove());

        //Usingi it as Stack LIFO
        deque.push("walden");
        deque.push("harry potter");
        deque.push("head first java");

        System.out.println("Printing Queue ..");
        System.out.println(deque.pop()); //removeFirst
        System.out.println(deque.pop());
        System.out.println(deque.pop());


        //Linked list also can be used with queue.
        //instead of arraydeque use linkedlist
        //this is much efiicient implementation of queue..


    }

    public static void main(String[] args)
    {
        dequeTest();
    }
}
