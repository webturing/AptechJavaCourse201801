package lec03string;

import java.util.Scanner;

public class P1573b {
    static boolean isSys(String s) {
        return new StringBuffer(s).reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            String s = cin.next();
            while (isSys(s) && s.length() % 2 == 0) {
                s = s.substring(0, s.length() / 2);
            }
            System.out.println(s.length());
        }
        cin.close();
    }
}
