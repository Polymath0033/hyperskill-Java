import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ax^2 + bx + c = 0
        // x = (-b +- sqrt(b^2 - 4ac)) / 2a
        // Get Values of a, b, c
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        // Discriminant d = b^2 - 4ac
        double d = b * b - 4 * a * c;
        // x1 = (-b + sqrt(b^2 - 4ac)) / 2a
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        // x2 = (-b - sqrt(b^2 - 4ac)) / 2a
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println(x1 + " " + x2);
        scanner.close();
    }
}
