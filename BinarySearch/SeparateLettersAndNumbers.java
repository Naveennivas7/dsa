package BinarySearch;

public class SeparateLettersAndNumbers {
    public static void main(String[] args) {

        String input = "Xy12Z3";

        String letters = "";
        String numbers = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters += ch;
            } else if (Character.isDigit(ch)) {
                numbers += ch;
            }
        }

        System.out.println("Letters=" + letters);
        System.out.println("Numbers=" + numbers);
    }
}