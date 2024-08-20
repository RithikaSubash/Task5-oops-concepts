package javaproject1;
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String str = inputString.toLowerCase();
        boolean isPalindrome = true;

        int length = str.length();

       
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break; 
            }
        }

        if (isPalindrome) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }

        scanner.close();
    }
}
