package week1.question1;

import java.util.Scanner;

public class Emre_EvenOrOdd {

     /*
    Write a method which can identify given number is even or odd
     */

    public static void main(String[] args) {

        evenOrOdd();
    }

    public static void evenOrOdd() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();
        String result = "";

        if (number % 2 == 0) {
            result = "Even number";
        } else {
            result = "Odd number";
        }

        System.out.println(result);
    }

}
