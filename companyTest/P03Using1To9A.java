package companyTest;

import java.util.Arrays;

public class P03Using1To9A {
    public static void main(String[] args) {
        for (int x = 123; x <= 987 / 3; x++) {
            int y = x * 2;
            int z = x * 3;
            char[] digits = String.format("%d%d%d", x, y, z).toCharArray();
            Arrays.sort(digits);
            if (new String(digits).equals("123456789")) {
                System.out.println(String.format("%d %d %d", x, y, z));
            }
        }
    }
}
