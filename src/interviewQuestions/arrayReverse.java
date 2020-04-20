package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayReverse
{
    public static void main(String args[]){

        String[] names = {"John", "Jammy", "Luke"};
        System.out.println("original array: " + Arrays.toString(names) );

        // reversing array with three elements
        reverse(names);
        System.out.println("reversed array: " + Arrays.toString(names) );

        String[] test = {"John","Sam"};
        System.out.println("original array: " + Arrays.toString(test) );

        // testing reverse array function with array of just one element
        reverse(test);
        System.out.println("reversed array: " + Arrays.toString(test) );



        String[] nm ={"John", "Jammy", "Luke"};
        List<String> list = new ArrayList<>();
        list = Arrays.asList(nm);
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void reverse(String[] array) {

        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }

}

