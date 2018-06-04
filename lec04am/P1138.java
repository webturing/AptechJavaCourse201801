package lec04am;

public class P1138 {
    final static String TEXT = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    final static String CODE = "bcdefghijklmnopqrstuvwxyza222333444555666777788899990123456789";

    public static void main(String[] args) {
        String text = "YUANzi1987";
        for (char c : text.toCharArray()) {
            int p = TEXT.indexOf(c);
            System.out.print(CODE.charAt(p));
        }

    }
}
