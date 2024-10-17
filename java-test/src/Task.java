import java.util.Scanner;

public class Task {
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

