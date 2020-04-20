package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class repeatedCharString
{
    public static void main(String[] args)
    {
        String str = "helloah";
        int n = str.length();
        //
        List<Character> list = new ArrayList<>();
        List<Character> dupList = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!list.contains(str.charAt(i)))
            {
                list.add(str.charAt(i));
            }
            else
            {
                dupList.add(str.charAt(i));
            }
        }
        list.removeAll(dupList);
        System.out.println("repeated char:"+dupList);
        System.out.println("unique char:"+list);
        Object[] test = list.toArray();
        System.out.println(test[0]);
    }

}
