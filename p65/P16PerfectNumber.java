package p65;

/**
 * 16完全数
 * 如果一个数恰好等于它的因子之和，则称该数为“完全数”。
 * <p>
 * 运行结果
 * There are following perfect numbers smaller than 1000:
 * 6 28 496
 */
public class P16PerfectNumber {
    public static void main(String[] args) {
        System.out.println("There are following perfect numbers smaller than 1000:");
        for (int n = 1; n < 1000; n++) {
            int s = 1;
            int m = 2;
            while (m * m < n) { //O(sqrt(n))
                if (n % m == 0) {
                    s += m + n / m;
                }
                m++;
            }
            if (m * m == n) s += m;
            if (n == s) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
