package tasks.processing_strings;

import java.util.Scanner;

/*
 * Write a program that reads a string s and an int n, and then moves the first n characters of s to the end of the string. The program must output the changed string. If n is greater than the length of the string, it must output the string unchanged.

Note, the substring method can help you, but you may choose another way to solve the problem.

Input data format

The single input line contains s and n separated by a space.


Sample Input:
Hello 3

Sample Output:
loHel

 */
public class MoveNFirstCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] splitText = text.split(" ");
        String s = splitText[0];
        int n = Integer.parseInt(splitText[1]);
        System.out.println(moveNFirstCharacter(s, n));
        scanner.close();
    }

    private static String moveNFirstCharacter(String s, int n) {
        if (n > s.length()) {
            return s;
        }
        return s.substring(n) + s.substring(0, n);
    }
}
