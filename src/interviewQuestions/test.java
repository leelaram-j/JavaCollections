package interviewQuestions;

import java.util.*;

public class test
{
    public static void main(String[] args)
    {
        int [] array={6,23,1,98,76,5,1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,76));
        System.out.println(Collections.frequency(Arrays.asList(array),1));

        String s ="hello";

        char[] str = s.toCharArray();
        List<char[]> list1 = Arrays.asList(str);

        Collections.reverse(list1);
        ListIterator li = list1.listIterator();
        while(li.hasNext())
        {
            System.out.print(li.next());
        }


        int n=153,temp,sumo=0,r;
        temp=n;
        while (n>0)
        {
            r=n%10;
            sumo=sumo+ (r*r*r);
            n=n/10;
        }

        if(temp==sumo)
        {
            System.out.println("armstrong true");
        }
        else
        {
            System.out.println("armstrong false");
        }
    }
}
