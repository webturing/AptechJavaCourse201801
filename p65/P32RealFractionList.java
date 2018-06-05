package p65;

/**
 * 32列出真分数序列
 * 按递增顺序依次列出所有分母为40，分子小于40的最简分数。
 * <p>
 * 运行结果
 * The fraction serials with demominator 40 is:
 * 1/40 3/40 7/40 9/40 11/40 13/40 17/40 19/40
 * 21/40 23/40 27/40 29/40 31/40 33/40 37/40 39/40
 */
public class P32RealFractionList {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 1; i <= 40; i++) {
            if (Tools.gcd(i, n) == 1)
                System.out.print(String.format("%d/%d ", i, n));
        }
    }
}
