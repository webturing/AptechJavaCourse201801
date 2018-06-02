package p20;


public class P08 {
    static boolean imply(boolean p, boolean q) {
        return !p || q;
    }

    public static void main(String[] args) {
        for (int a = 0; a <= 1; a++)
            for (int b = 0; b <= 1; b++)
                for (int c = 0; c <= 1; c++)
                    for (int d = 0; d <= 1; d++)
                        for (int e = 0; e <= 1; e++) {
                            boolean b0 = (a + b + c + d + e) == 3;
                            boolean b1 = (a + c < 2);
                            boolean b2 = (b + c > 0);
                            boolean b3 = imply(c == 1, d + e == 1);
                            boolean b4 = (b + c + d < 3);
                            boolean b5 = imply(b == 1, d + e < 2);
                            if (b0 && b1 && b2 && b3 && b4 && b5)
                                System.out.println(String.format("%d%d%d%d%d",
                                        a, b, c, d, e));
                        }

    }

}
