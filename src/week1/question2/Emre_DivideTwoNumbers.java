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

        scan.close();

        int result = 0;
        int i = 0;
        while (number1 >= number2) {
            number1 -= number2;
            i++;
        }
        result = i;
        System.out.println("Division: " + result);

    }

}

/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
 */

