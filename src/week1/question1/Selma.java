package src.week1.question1;
import java.util.Scanner;
public class Selma {
    public static void OddOrEven(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please digit your number: ");
        int number = scan.nextInt();

        if(number%2==0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your  number is odd");


        }


    }

    public static void main(String[] args) {

        OddOrEven();


    }





}
