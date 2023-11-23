package src.week1.question2;

import java.util.Scanner;

public class Selma {
    public static void main(String[] args) {

        DivideTwoNumbers();

    }
    private static void DivideTwoNumbers(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();

        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);

    }


}
