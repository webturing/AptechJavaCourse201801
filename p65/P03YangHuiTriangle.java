package p65;

/**
 * 3杨辉三角形
 * 在屏幕上显示杨辉三角形
 * <p>
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * ..................
 */
public class P03YangHuiTriangle {
    final static int N = 10;
    static int[][] Q = new int[N][N];

    static {
        fill();
        print();
    }

    private static void fill() {
        for (int i = 0; i < N; i++) {
            Q[i][0] = Q[i][i] = 1;
        }
        for (int i = 1; i < N; i++)
            for (int j = 1; j < i; j++)
                Q[i][j] = Q[i - 1][j] + Q[i - 1][j - 1];
    }

    static void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(String.format("%d ", Q[i][j]));
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }


}
