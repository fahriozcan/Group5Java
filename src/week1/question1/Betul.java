package week1.question1;

import java.util.Scanner;

public class Betul {

    public static void OddOrEven(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println( num + "  is an even number");
        } else {
            System.out.println( num + " is an odd number");
        }
    }

    public static void main(String[] args){

        OddOrEven();

    }

}
