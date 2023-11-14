package week1.question2;

import java.util.Scanner;

public class fahri extends RuntimeException{

    private static void divideWithoutDivision(){
        int division = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your dividend number");
        int number1 = input.nextInt();
        System.out.println("Enter your divisor number");
        int number2 = input.nextInt();
        // I allow user to enter numbers

        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        // I do not want the result will be negative

        if(number2==0){
            throw new ArithmeticException("Divisor can not be zero");
        } // divisor can not be zero, otherwise my method will get exception, so I prevent it.

        while(number1>=number2){
            number1 = number1 - number2;
            division++;
        }

        System.out.println("The result of this division is => " + division);
    }

    public static void main(String[] args) {
        divideWithoutDivision();
    }

}
