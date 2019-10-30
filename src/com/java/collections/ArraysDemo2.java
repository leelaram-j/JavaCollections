package com.java.collections;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysDemo2
{
    private static void parallel()
    {
        // For large arrays on multi core. Min Size atleast 1>> 13 = 8192
        int [] iArray = {23,4,59};
        Arrays.parallelSort(iArray);
        System.out.println("Parallel Sort:"+Arrays.toString(iArray));

        // Fibonacci series of given array of elements
        IntBinaryOperatorImpl imp = new IntBinaryOperatorImpl();
        Arrays.parallelPrefix(iArray,imp);
        System.out.println("Parallel Prefix:"+Arrays.toString(iArray));


    }

    public static void main(String[] args)
    {
        parallel();
    }
}


class IntBinaryOperatorImpl implements IntBinaryOperator
{

    @Override
    public int applyAsInt(int left, int right) {
        return left+right;
    }
}

class IntUnaryOperatorImpl implements IntUnaryOperator
{

    @Override
    public int applyAsInt(int operand) {
        return 0;
    }

    @Override
    public IntUnaryOperator compose(IntUnaryOperator before) {
        return null;
    }

    @Override
    public IntUnaryOperator andThen(IntUnaryOperator after) {
        return null;
    }
}