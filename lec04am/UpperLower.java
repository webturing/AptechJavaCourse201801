package lec04am;

public class UpperLower {
    public static void main(String[] args) {
        String s = "I like ACM,I want an ACCEPT.";
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (Character.isUpperCase(cs[i]))
                cs[i] = Character.toLowerCase(cs[i]);
            else if (Character.isLowerCase(cs[i]))
                cs[i] = Character.toUpperCase(cs[i]);
        }

        System.out.println(new String(cs));
    }
}
