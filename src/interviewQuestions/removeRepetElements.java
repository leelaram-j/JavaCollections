package interviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeRepetElements
{
    public static void main(String[] args) {
        int a[] = {4, 1, 3, 4, 6, 4, 5, 6};
        int len = a.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] == a[j]) {
                    a[j] = a[len - 1];
                    len--;
                    System.out.println(len);
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");

        }

        int b[] = {4, 1, 3, 4, 6, 4, 5, 6};
        Set<Integer> hs = new HashSet<>();

    }
}
