package p20;

public class P11DistributeCandy {
    final static int N = 64;
    final static int M = N / 4;

    public static void main(String[] args) {
        for (int a = N / 2; a <= N; a++)
            for (int b = 0; b <= N - a; b++)
                for (int c = 0; c <= N - a - b; c++) {
                    int d = N - a - b - c;
                    int[] A = new int[]{a, b, c, d};
                    for (int i = 0; i < A.length; i++) {
                        for (int j = 0; j < A.length; j++) {
                            if (j == i)
                                continue;
                            A[i] -= A[j];
                            A[j] <<= 1;
                        }
                    }
                    if (A[0] == M && A[1] == M && A[2] == M && A[3] == M) {
                        System.out.println(String.format("%d %d %d %d", a, b, c, d));
                    }
                }

    }

}
