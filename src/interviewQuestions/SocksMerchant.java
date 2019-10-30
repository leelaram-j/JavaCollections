package interviewQuestions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/*
* Problem statement:
* John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
* Given an array of integers representing the color of each sock, determine how many pairs of socks with
* matching colors there are.
* For example, there are  socks with colors . There is one pair of color and one of color.
* There are three odd socks left, one of each color. The number of pairs is .
*
*/


public class SocksMerchant {
    static int sockMerchant(int n, int[] ar) {
        int counter=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            int element=ar[i];
            if(hs.contains(element))
            {
                hs.remove(element);
                counter++;
            }
            else
            {
                hs.add(element);
            }
        }
        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
