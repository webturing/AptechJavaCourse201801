package lec04am;

public class CaesarCode {
    public static void main(String[] args) {
        char c = 'x';
        int k = 4;
        System.out.println((char) ('a' + ((c - 'a') + k) % 26));
        String s = "I love you.";
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (Character.isLowerCase(cs[i])) {
                cs[i] = (char) ('a' + ((cs[i] - 'a') + k) % 26);
            } else if (Character.isUpperCase(cs[i])) {
                cs[i] = (char) ('A' + ((cs[i] - 'A') + k) % 26);
            }

        }
        System.out.println(new String(cs));

    }
}
