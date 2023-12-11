package week2.question2;

import java.util.Scanner;

public class Fahri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one word and one number in order to merge them one character at a time");

        String str1 = input.next();
        String str2 = input.next();

        String result = "";

        if(str1.length() < str2.length()){
            for (int i = 0, j = 0; i < str1.length(); i++, j++){
                result += "" + str1.charAt(i) + str2.charAt(j);
            }
            result += str2.substring(str1.length());
        } else if (str1.length() > str2.length()) {
            for (int i = 0, j = 0; i < str2.length(); i++, j++){
                result += "" + str1.charAt(i) + str2.charAt(j);
            }
            result += str1.substring(str2.length());
        } else {
            for (int i = 0, j = 0; i < str1.length(); i++, j++){
                result += "" + str1.charAt(i) + str2.charAt(j);
            }
        }
        System.out.println(result);
    }
}
