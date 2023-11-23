package week1.question2;

import java.util.Scanner;

public class Alexandru {

        private static int divide(int dividend, int divisor) {
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            if (dividend == 0) {
                throw new ArithmeticException("Cannot divide  zero");
            }

            int quotient = 0;
            while (dividend >= divisor) {
                dividend -= divisor;
                quotient++;
            }

            return quotient;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter the dividend: ");
                int dividend = scanner.nextInt();

                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();

                int result = divide(dividend, divisor);
                System.out.println("Result of " + dividend + " divided by " + divisor + " is: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter valid integers.");
            } finally {
                scanner.close();
            }
    }
}
