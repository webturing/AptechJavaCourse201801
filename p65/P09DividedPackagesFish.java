package p65;

import java.awt.*;

/**
 * 9平分七筐鱼
 * 甲、乙、丙三位鱼夫出海打鱼，他们随船带了21只箩筐。当晚返航时，他们发现有七筐装满了鱼，
 * 还有七筐装了半筐鱼，另外七筐则是空的，由于他们没有秤，
 * 只好通过目测认为七个满筐鱼的重量是相等的，7个半筐鱼的重量是相等的。在不将鱼倒出来的前提下，怎样将鱼和筐平分为三份？
 * <p>
 * 运行结果
 * It exists possible distribution plans:
 * No.1 Full basket Semi--basket Empty
 * fisher A: 1 5 1
 * fisher B: 3 1 3
 * fisher C: 3 1 3
 * No.2 Full basket Semi--basket Empty
 * fisher A: 2 3 2
 * fisher B: 2 3 2
 * fisher C: 3 1 3
 */
public class P09DividedPackagesFish {

    static Point full = new Point(2, 1);
    static Point half = new Point(1, 1);
    static Point empty = new Point(0, 1);

    static Point add(Point a, Point b, Point c) {
        return new Point(a.x + b.x + c.x, a.y + b.y + c.y);
    }

    static Point mul(Point p, int x) {
        return new Point(p.x * x, p.y * x);
    }

    static boolean eq(Point a, Point b) {
        return a.x == b.x && a.y == b.y;
    }

    public static void main(String[] args) {
        for (int f1 = 0; f1 <= 7; ++f1)
            for (int h1 = 0; h1 <= 7; ++h1)
                for (int e1 = 0; e1 <= 7; ++e1)
                    for (int f2 = f1; f2 <= 7 - f1; ++f2)
                        for (int h2 = 0; h2 <= 7 - h1; ++h2)
                            for (int e2 = 0; e2 <= 7 - e1; ++e2) {
                                int h3 = 7 - h1 - h2;
                                int f3 = 7 - f1 - f2;
                                if (f3 < f2) continue;//不重复枚举
                                int e3 = 7 - e1 - e2;
                                Point p1 = add(mul(full, f1), mul(half, h1), mul(empty, e1));
                                Point p2 = add(mul(full, f2), mul(half, h2), mul(empty, e2));
                                Point p3 = add(mul(full, f3), mul(half, h3), mul(empty, e3));
                                if (eq(p1, p2) && eq(p2, p3)) {
                                    System.out.println(String.format("%d %d %d", f1, h1, e1));
                                    System.out.println(String.format("%d %d %d", f2, h2, e2));
                                    System.out.println(String.format("%d %d %d", f3, h3, e3));
                                    System.out.println("------------------------------");
                                }

                            }


    }
}
