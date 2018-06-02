package companyTest;

public class P02FinaPQRS {
    public static void main(String[] args) {
        for (int p = 2; p <= 4; p++)
            for (int q = p; q <= 3 * p; q++)
                for (int r = q; r <= 2 * p * q; r++)
                    for (int s = r; s <= p * q * r; s++) {
                        int M = p * q * r * s;
                        if (M == M / p + M / q + M / r + M / s)
                            System.out.println(String.format("1/%d+1/%d+1/%d+1/%d==1", p, q, r, s));
                    }
    }
}
