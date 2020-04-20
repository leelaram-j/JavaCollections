package interviewQuestions;

import java.util.Arrays;

public class anagram
{
    public static void main(String[] A)
    {
        String s1 ="java ", s2=" aavj";
        char[] c1 = s1.toCharArray();
        char[] c2= s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.compare(c1,c2)==0)
        {
            System.out.println("It is a Anagram");
        }
        else
        {
            System.out.println("It is not a Anagram");
        }
    }
}
