package may21;

import java.util.Scanner;

public class CharToAscii {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.println("Enter a character:");

        // Read the input character
        char ch = scanner.next().charAt(0);

        // Convert the character to its ASCII value
        int asciiValue = ch;

        // Display the ASCII value
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
