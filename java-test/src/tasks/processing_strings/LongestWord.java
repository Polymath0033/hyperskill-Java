package tasks.processing_strings;

import java.util.Scanner;

/*
 * Write a Java program that receives a string representing a sentence. Your program should find the longest word in the sentence and print it out. Assume that the words in the sentence are separated by a single space and there are no punctuation marks.


Sample Input:
This is a sample sentence

Sample Output:
sentence


Sample Input:
Java is a powerful language

Sample Output:
powerful

 */
public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
        scanner.close();
    }
}
