package interviewQuestions;

public class prime
{
    public static void main(String[] args)
    {
        int n=17;
        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i ==0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }
    }
}
