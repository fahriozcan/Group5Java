package week1.question3;

public class Abdullatif {

    public static void Finra(int number){

        if (number % 3 == 0 && number % 5 != 0){
            System.out.println("Fin");
        } else if (number % 3 != 0 && number % 5 == 0) {
            System.out.println("Ra");
        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FinRa");
        }


    }

    public static void main(String[] args) {
        Finra(3);
    }

}
