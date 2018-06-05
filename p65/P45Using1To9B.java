package p65;
/**
 * 45  1~9组成三个3位的平方数
 * 将1、2、3、4、5、6、7、8、9九个数字分成三组，每个数字只能用一次，即每组三个数不允许有重复数字，也不许同其它组的三个数字重复，要求每组中的三位数都组成一个平方数。
 * <p>
 * 运行结果
 * The 3 squares with 3 different digits each are:
 * 361,529,784
 */

import java.util.Arrays;
import java.util.Vector;

public class P45Using1To9B {
    public static void main(String[] args) {
        Vector<Integer> squares = new Vector<>();
        for (int i = 13; i * i < 1000; i++) {
            int sq = i * i;
            int a = sq / 100;
            int b = sq % 100 / 10;
            int c = sq % 10;
            if (a != b && b != c && c != a && Math.min(a, Math.min(b, c)) > 0)
                squares.add(sq);
        }
        System.out.println(" The 3 squares with 3 different digits each are:");
        for (int i = 0; i < squares.size(); i++)
            for (int j = i + 1; j < squares.size(); j++)
                for (int k = j + 1; k < squares.size(); k++) {
                    char[] digits = String.format("%d%d%d", squares.get(i), squares.get(j), squares.get(k)).toCharArray();
                    Arrays.sort(digits);
                    if (new String(digits).equals("123456789")) {
                        System.out.println(String.format("%d %d %d,", squares.get(i), squares.get(j), squares.get(k)));
                    }
                }
    }
}
