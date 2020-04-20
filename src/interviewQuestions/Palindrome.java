package interviewQuestions;

public class Palindrome
{
    public static void main(String[] args)
    {
        String str = "mom";
        boolean isPalin = true;
        int start =0;
        int end = str.length()-1;
        while (start<end)
        {
            if((str.charAt(start))!= (str.charAt(end)))
            {
                isPalin = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalin)
        {
            System.out.println("String is palin");
        }
        else
        {
            System.out.println("String is not palin");
        }
    }
}
