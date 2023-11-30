package week1.question1;
import java.util.Scanner;

public class Xenia {
    private static void evenOrOdd() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = input.nextInt();
        if (number%2 == 0)
            System.out.println("number " + number + " is an even number");

       else {
            System.out.println("number " + number + " is an odd number");
        }


    }
    public static void main(String[] args) {

        evenOrOdd();

    }



}
