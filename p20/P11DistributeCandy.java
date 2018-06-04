package p20;

public class P11DistributeCandy {
    final static int N = 64;
    final static int M = N / 4;

    public static void main(String[] args) {
        for (int a = N / 2; a <= N; a++)
            for (int b = 0; b <= N - a; b++)
                for (int c = 0; c <= N - a - b; c++) {
                    int d = N - a - b - c;
                    int A = a, B = b, C = c, D = d;
                    A -= B + C + D;
                    B *= 2;
                    C *= 2;
                    D *= 2;
                    B -= A + C + D;
                    A *= 2;
                    C *= 2;
                    D *= 2;
                    C -= A + B + D;
                    A *= 2;
                    B *= 2;
                    D *= 2;
                    D -= A + B + C;
                    A *= 2;
                    B *= 2;
                    C *= 2;
                    if (A == M && B == M && C == M && D == M) {
                        System.out.println(String.format("%d %d %d %d", a, b, c, d));
                        A = a;
                        B = b;
                        C = c;
                        D = d;
                        A -= B + C + D;
                        B *= 2;
                        C *= 2;
                        D *= 2;
                        System.out.println(String.format("%d %d %d %d", A, B, C, D));
                        B -= A + C + D;
                        A *= 2;
                        C *= 2;
                        D *= 2;
                        System.out.println(String.format("%d %d %d %d", A, B, C, D));
                        C -= A + B + D;
                        A *= 2;
                        B *= 2;
                        D *= 2;
                        System.out.println(String.format("%d %d %d %d", A, B, C, D));
                        D -= A + B + C;
                        A *= 2;
                        B *= 2;
                        C *= 2;
                        System.out.println(String.format("%d %d %d %d", A, B, C, D));
                    }

                }

    }

}
