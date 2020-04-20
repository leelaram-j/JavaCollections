package interviewQuestions;

public class Factorial
{
    public static int fact(int n) {
        if(n<=1)
            return 1;
        else
            return n * fact(n-1);
    }

    public static int fibo(int n) {
        if(n<1) {
            return 0;
        }
        else if(n==1 || n==2)
            return n-1;
        else
            return fibo(n-1) + fibo(n-2);
    }
// 0 1 1 2 3 5
    public static void main(String [] args) {
        int n = fact(5);
        System.out.println(n);
        for(int i=1;i<=5;i++){
            //System.out.println(i);
            System.out.print(fibo(i) + " ");
        }
    }
}
