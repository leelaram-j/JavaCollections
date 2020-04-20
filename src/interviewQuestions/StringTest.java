package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringTest
{
    public static void main(String[] args)
    {
        String str = "Payment $700 received";
        System.out.println(str.replace("a","e"));
        System.out.println(str);
        String[] str1 = str.split(" ");
        System.out.println(Arrays.toString(str1));
        System.out.println(str.charAt(3));
        System.out.println(str.substring(3,10));
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("700"));
        System.out.println(str.concat(" Test"));
        System.out.println(str.indexOf("$700",10));
        System.out.println(str.length());

        System.out.println("Str="+str.replace("$","*"));


        Set<Integer> set1 = new HashSet<>();
        set1.add(90);
        set1.add(-1);
        set1.add(5);
        System.out.println(set1);

    }
}
