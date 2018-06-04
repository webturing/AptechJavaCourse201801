package contest1166;

public class F {
    final static String TEXT = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    final static String CODE = "bcdefghijklmnopqrstuvwxyza222333444555666777788899990123456789";

    public static void main(String[] args) {
        String text = "YUANzi1987";
        for (char t : text.toCharArray()) {
            char c = CODE.charAt(TEXT.indexOf(t));
            System.out.print(c);
        }
    }
}
