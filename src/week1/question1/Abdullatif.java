package week1.question1;

import java.util.Scanner;

public class Abdullatif {

    public static void OddOrEven(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int inputNumber = scanner.nextInt();

        if (inputNumber == 0) {
            System.out.println(inputNumber + " is zero");
        }else {
            if (inputNumber % 2 == 0) {
                System.out.println(inputNumber + " is even number.");
            } else {
                System.out.println(inputNumber + " is odd number.");
            }
        }
    }

    public static void main(String[] args) {
        OddOrEven();
    }


}
