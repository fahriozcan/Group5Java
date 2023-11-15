package src.week1.question2;

import java.util.Scanner;

public class halimQ2 {

    public static void main(String[] args) {

        divideTwoNumbers();

    }

    private static void divideTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int number1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int number2 = sc.nextInt();

        System.out.println("result = " + Math.floorDiv(number1,number2));

    }
}
