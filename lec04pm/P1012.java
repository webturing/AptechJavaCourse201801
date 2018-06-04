package lec04pm;

public class P1012 {
    public static void main(String[] args) {
        for (int n = 1; ; n++) {
            if (n % 8 != 1)
                continue;
            if (n / 8 % 8 != 1)
                continue;
            int b = n / 8 / 8;
            if (b % 8 != 7)
                continue;
            int a = b / 8;
            if (n % 17 != 4)
                continue;
            if (n / 17 % 17 != 15)
                continue;
            int c = n / 17 / 17;
            if (c != 2 * a)
                continue;
            System.out.println(n);
            break;
        }
    }
}
