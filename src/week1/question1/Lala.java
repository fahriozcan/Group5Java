package week1.question1;

import java.util.Scanner;

public class Lala {
    public static void OddOrEven() {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter your number");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "  is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}