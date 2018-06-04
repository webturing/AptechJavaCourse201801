package lec01pm;

import java.util.Scanner;

public class P1274Sort3B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int min = 0, mid = 0, max = 0;
        min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        mid = (a + b + c) - min - max;
        System.out.println(String.format("%d %d %d", min, mid, max));
        cin.close();

    }
}
