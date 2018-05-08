package lec03string;

public class CharacterDemo {
    public static void main(String[] args) {
        char c = '9';
        System.out.println("lowerCaseLetter:" + ('a' <= c && c <= 'z'));
        System.out.println("upperCaseLetter:" + ('A' <= c && c <= 'Z'));
        System.out.println("digit:" + ('0' <= c && c <= '9'));

        System.out.println(Character.isLowerCase(c));
        System.out.println(Character.isUpperCase(c));
        System.out.println(Character.isLetter(c));

        char d = 'x';
        if ('A' <= d && d <= 'Z')
            System.out.println((char) (d - 'A' + 'a'));
        else
            System.out.println(d);
        System.out.println(Character.toUpperCase(d));
        System.out.println(Character.toLowerCase(d));

    }
}
