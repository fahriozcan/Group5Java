package src.week1.question1;

import java.util.Scanner;

public class halim {

    /*
    Write a method which can identify given number is even or odd
     */

    public static void main(String[] args) {

        evenOrOdd();

    }

    private static void evenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();
        if (number%2 == 0)
            System.out.println("number + \" is EVEN !!!\" = " + number + " is EVEN !!!");

        if (number % 2 == 1)
            System.out.println("number = " + number + " is ODD !!!");

    }

}
