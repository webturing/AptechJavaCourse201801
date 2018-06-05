package p65;

/**
 * 17 亲密数
 * 如果整数A的全部因子(包括1，不包括A本身)之和等于B；且整数B的全部因子(包括1，不包括B本身)之和等于A，
 * 则将整数A和B称为亲密数。求3000以内的全部亲密数。
 * <p>
 * 运行结果
 * There are following friendly--numbers pair smaller than 3000:
 * 220.. 284 1184.. 1210 2620.. 2924
 */

public class P17IntimateNumber {
    public static void main(String[] args) {
        for (int n = 1; n <= 3000; n++) {
            int m = sumFactor(n);
            if (n > m) continue;//remove duplicate
            if (isIntimate(n, m)) {
                System.out.println(String.format("%d %d", n, m));
            }
        }

    }

    private static boolean isIntimate(int n, int m) {
        return sumFactor(n) == m && sumFactor(m) == n;
    }

    private static int sumFactor(int n) {
        int sum = 1;
        int c = 2;
        for (; c * c < n; c++) {
            if (n % c == 0) {
                sum += c + n / c;
            }
        }
        if (c * c == n)
            sum += c;
        return sum;

    }
}
