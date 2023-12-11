package week2.question3;

public class Fahri {

    public static void merge(String str1, String str2){
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

    public static String mergeTwo(String str1, String str2){
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
        return result;
    }

    public static void main(String[] args) {

        merge("asdfh", "12345");

        System.out.println(mergeTwo("asdf", "12545"));

    }


}
