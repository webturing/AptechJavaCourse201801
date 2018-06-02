package companyTest;

import java.util.Arrays;
import java.util.Vector;

public class P04Using1To9B {
    public static void main(String[] args) {
        Vector<Integer> squares = new Vector<>();
        for (int i = 13; i * i < 1000; i++) {
            int sq = i * i;
            int a = sq / 100;
            int b = sq % 100 / 10;
            int c = sq % 10;
            if (a != b && b != c && c != a && Math.min(a, Math.min(b, c)) > 0)
                squares.add(sq);
        }
        System.out.println(squares);
        for (int i = 0; i < squares.size(); i++)
            for (int j = i + 1; j < squares.size(); j++)
                for (int k = j + 1; k < squares.size(); k++) {
                    char[] digits = String.format("%d%d%d", squares.get(i), squares.get(j), squares.get(k)).toCharArray();
                    Arrays.sort(digits);
                    if (new String(digits).equals("123456789")) {
                        System.out.println(String.format("%d %d %d", squares.get(i), squares.get(j), squares.get(k)));
                    }
                }
    }
}
