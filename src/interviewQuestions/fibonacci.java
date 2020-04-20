package interviewQuestions;

public class fibonacci {

    public static int fibonacci1(int n) {
        if(n<=1)
            return 1;
        return fibonacci1(n-1) + fibonacci1(n-2);
    }

    public static void main(String[] args) {
        int n=9;
        System.out.println(fibonacci1(n));
    }
}
