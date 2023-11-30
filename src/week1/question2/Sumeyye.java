package week1.question2;

import java.util.Scanner;

public class Sumeyye {

    public static void main(String[] args) {

        divideTwoNumbers();
    }


    private static void divideTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int number2 = sc.nextInt();

        System.out.println("result: " + Math.floorDiv(number1,number2));
    }
    //let make changes





}
/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
 */
