package lec01pm;

import java.util.Scanner;

public class P2347Root2B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);// Alt+/
        double a = cin.nextDouble();
        double b = cin.nextDouble();
        double c = cin.nextDouble();
        cin.close();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("no answer");
            return;
        }
        if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println(String.format("%.4f", x));
            return;
        }
        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println(String.format("%.4f %.4f", x1, x2));

    }

}
