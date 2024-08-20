package javaproject1;
import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < (2 * (n - i - 1) - 1); j++) {
                System.out.print(" ");
            }

            if (i != n - 1) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < (2 * (n - i - 1) - 1); j++) {
                System.out.print(" ");
            }

            if (i != n - 1) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}