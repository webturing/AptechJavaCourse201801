package p20;

import java.util.Arrays;

public class P11DistributeCandy2 {
    final static int N = 64;
    final static int M = N / 4;

    public static void main(String[] args) {
        int[] a = new int[4];
        Arrays.fill(a, M);
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < a.length; j++) {
                if (i == j)
                    continue;
                a[j] >>= 1;
                a[i] += a[j];
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
