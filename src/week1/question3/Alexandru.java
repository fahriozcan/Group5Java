package week1.question3;

public class Alexandru {
    public static void main(String[] args) {
        printFinraNumbers();
    }

    private static void printFinraNumbers() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }


    }
}

