package week2.question1;

public class Fahri {

    public static void main(String[] args) {

        String str1 = "12345";
        String str2 = "ABCDE";

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
