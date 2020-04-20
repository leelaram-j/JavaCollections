package interviewQuestions;

import java.util.Arrays;

public class Arraysort {
    public static void main(String[] args) {
        int[] a = {23,45,1,454,76,2,345,6,9,787};
        Arrays.sort(a);
        Arrays.stream(a).forEach(s->System.out.println(s));
        Arrays.stream(a).filter(x-> x%2 == 0).forEach(x->System.out.println("even :"+x));
        Arrays.stream(a).map(x->x%2).forEach(x->System.out.println(x));
        Arrays.stream(a).sorted().forEach(x->System.out.println(x));
    }
}
