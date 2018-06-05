package p65;

import java.util.Arrays;

/**
 * 21歌德巴赫猜想
 * 验证：2000以内的正偶数都能够分解为两个素数之和(即验证歌德巴赫猜想对2000以内的正偶数成立)。
 */
public class P21VerifyGoldbachTheory {
    final static int maxn = 2000 + 1;
    static boolean[] isPrime = new boolean[maxn];

    static {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= maxn; i++)
            for (int j = i * i; j < maxn; j += i)
                isPrime[j] = false;
    }

    static boolean testGoldbach(int n) {
        if (n == 4) {
            System.out.println("4=2+2");
            return true;
        }
        for (int p = 3; p <= n >> 1; p += 2)
            if (isPrime[p] && isPrime[n - p]) {
                System.out.println(String.format("%d=%d+%d", n, p, n - p));
                return true;
            }
        System.out.println("Congratulations!");
        return false;

    }

    public static void main(String[] args) {
        for (int n = 4; n <= maxn; n += 2)
            testGoldbach(n);
    }
}
