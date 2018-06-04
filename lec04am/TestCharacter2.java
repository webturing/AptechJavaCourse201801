package lec04am;

public class TestCharacter2 {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println('a' <= c && c <= 'z');// isLowerCaseLetter
        System.out.println('A' <= c && c <= 'Z');// isUpperCaseLetter
        System.out.println('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z');// isLetter
        System.out.println('0' <= c && c <= '9');// isDigit

        System.out.println(Character.isLowerCase(c));// isLowerCaseLetter
        System.out.println(Character.isUpperCase(c));// isUpperCaseLetter
        System.out.println(Character.isLetter(c));// isLetter
        System.out.println(Character.isDigit(c));// isDigit


        c = 'B';
        if (Character.isLowerCase(c))
            c = (char) (c - 32);
        System.out.println(c);
        System.out.println(Character.toUpperCase(c));
        System.out.println(Character.toLowerCase(c));

    }

}
