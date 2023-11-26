package week1.question2;

import java.util.Scanner;

public class Abdullatif {

    private static void divideWithoutDivision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend number:");
        int number1 = sc.nextInt();
        System.out.println("Enter divisor number:");
        int number2 = sc.nextInt();

        if(number2==0){
            throw new ArithmeticException("Divisor can not be zero");
        }

        System.out.println("result = " + Math.floorDiv(number1,number2));

    }

    public static void main(String[] args) {
        divideWithoutDivision();
    }




}
