package week1.question1;

import java.util.Scanner;

public class fahri {

    public static void evenOrOdd(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("Number " + number + " you entered is a even");
        } else {
            System.out.println("Number " + number + " you entered is an odd");
        }
    }

    public static void main(String[] args){

        evenOrOdd();

    }

}
