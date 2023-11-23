package week1.question2;

import java.util.Scanner;

public class Emre_DivideTwoNumbers {

    public static void main(String[] args) {

        divideTwoNumbers();

    }

    public static void divideTwoNumbers() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = scan.nextInt();

        System.out.println("Enter second number:");
        int number2 = scan.nextInt();

        while (number2 == 0) {
            System.out.println("Divider can not be zero. Enter a new number:");
            number2 = scan.nextInt();

        }

        int result = number1 / number2;
        System.out.println("Division: " + result);

    }

}


