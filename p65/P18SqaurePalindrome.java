package p65;

/**
 * 18 回文数
 * 打印所有不超过n(取n<256) 的其平方具有对称性质的数(也称回文数)。
 * <p>
 * 运行结果
 * No. number it's square(palindrome)
 * 1 1 1
 * 2 2 4
 * 3 3 9
 * 4 11 121
 * 5 22 484
 * 6 26 676
 * 7 101 10201
 * 8 111 12321
 * 9 121 14641
 */
public class P18SqaurePalindrome {
    public static void main(String[] args) {
        for (int n = 1, cnt = 0; n < 256; n++) {
            if (Tools.isSysmetric(n * n)) {
                System.out.println(String.format("%d %d %d", ++cnt, n, n * n));
            }
        }
    }
}
