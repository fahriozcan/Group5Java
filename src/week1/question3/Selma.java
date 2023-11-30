package src.week1.question3;

public class Selma {
    private static void FinRa (){
        for (int i = 1; i < 31; i++) {
            if(i%3==0 && i%5==0){
                System.out.print("FINRA ");
            } else if (i%3==0) {
                System.out.print("FIN ");
            } else if (i%5==0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        FinRa();

    }
}
