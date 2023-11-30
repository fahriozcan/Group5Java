package week1.question1;

import java.util.Scanner;

public class Alexandru {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println("Input is blank or empty. Please enter a valid number.");
        } else {
            try {
                int number = Integer.parseInt(input);
                if (number % 2 == 0) {
                    System.out.println(number + " is an even number.");
                } else {
                    System.out.println(number + " is an odd number.");
                }
            } catch (RuntimeException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        scanner.close();
    }

}
