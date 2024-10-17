package tasks.processing_strings;

/*
 * All the letters of the English alphabet are divided into vowels and
 * consonants.
 * The vowels are: a, e, i, o, u, y.
 * The remaining letters are consonants.
 * 
 * A word is considered euphonious (pleasant-sounding) if it doesn't have three
 * or more vowels or consonants in a row. Otherwise, it is considered discordant
 * (harsh-sounding).
 * 
 * Your task is to create euphonious words from discordant. You can insert any
 * letters inside the word. You should output the minimum number of characters
 * needed to create a euphonious word from a given word.
 * 
 * For example, the word "schedule" is considered discordant because it has
 * three consonants "sch" in a row. To create a euphonious word you need to add
 * any vowel between 's' and 'c' or between 'c' and 'h'.
 * 
 * 
 * Sample Input:
 * schedule
 * 
 * Sample Output:
 * 1
 * 
 * 
 * Sample Input:
 * garage
 * 
 * Sample Output:
 * 0
 */
import java.util.Scanner;

public class Euphonious {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        System.out.println(countInsertionWords(words));
        scanner.close();
    }

    public static int countInsertionWords(String words) {
        int insertions = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        for (char c : words.toCharArray()) {
            if (isVowel(c)) {
                vowelCount++;
                consonantCount = 0;
                if (vowelCount == 3) {
                    insertions++;
                    vowelCount = 1;
                }
            } else {
                consonantCount++;
                vowelCount = 0;
                if (consonantCount == 3) {
                    insertions++;
                    consonantCount = 1;
                }
            }
        }
        return insertions;
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

}
