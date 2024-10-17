package tasks.processing_strings;

import java.util.Scanner;

/*
 * Upon learning that DNA is not a random string, freshmen of the Bioinformatics Institute from the informatics group suggested using a compression algorithm that compresses repeated characters in a string.

Encoding is performed as follows:
The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the groups of the same characters of the input string are replaced by the symbol and the number of its repetitions in this string.

Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence. The encoding must be case sensitive.

Note, string can contain only a single character.


Sample Input:
aaaabbcaa

Sample Output:
a4b2c1a2

 */
public class CompressionAlgorithms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        char currentChar = sc.charAt(0);
        int count = 1;
        StringBuilder newString = new StringBuilder();
        for (int i = 1; i < sc.length(); i++) {
            char nextChar = sc.charAt(i);
            if (nextChar == currentChar) {
                count++;
            } else {
                newString.append(nextChar).append(count);
                currentChar = nextChar;
                count = 1;
            }
        }
        newString.append(currentChar).append(count);
        scanner.close();
    }
}
