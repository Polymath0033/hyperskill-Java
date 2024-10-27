package tasks.processing_strings;

import java.util.Scanner;

/*
 * Write a program that finds the frequency of occurrences of a substring in a given string. Substrings cannot overlap: for example, the string ababa contains only one substring aba.


Input data format

The first input line contains a string, the second one contains a substring.


Sample Input:
ababa
aba

Sample Output:
1


Sample Input:
hello there
the

Sample Output:
1


Sample Input:
hello yellow jello
ll

Sample Output:
3
 */
public class NumberOfOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainString = scanner.nextLine();
        String subString = scanner.nextLine();
        int count = 0;
        int index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        System.out.println(count);
        scanner.close();
    }
}
