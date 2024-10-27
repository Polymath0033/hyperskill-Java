package tasks.processing_strings;

/*
 * Write a program that reads a string and then output another string with doubled characters.


Sample Input:
The

Sample Output:
TThhee


 */
import java.util.Scanner;

public class DoubleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = "";
        for (char c : word.toCharArray()) {
            text += c + c;
        }
        System.out.println(text);
        scanner.close();
    }
}
