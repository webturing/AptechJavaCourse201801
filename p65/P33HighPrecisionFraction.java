package p65;


import java.math.BigDecimal;

/**
 * 33计算分数的精确值
 * 使用数组精确计算M/N(0<M<N<=100)的值。如果M/N是无限循环小数，则计算并输出它的第一循环节，同时要求输出 循环节的起止位置(小数位的序号)。
 * <p>
 * 运行结果
 * Please input a fraction(m/n)(<0<m<n<=100):1/3
 * 1/3 it's accuracy value is:0.3
 * and it is a infinite cyclic fraction from 1
 * digit to 1 digit after decimal point.
 */
public class P33HighPrecisionFraction {
    public static void main(String[] args) {
        int n = 903, m = 170;
        int g = Tools.gcd(n, m);
        n /= g;
        m /= g;
        int index2, index5;
        index2 = index5 = 0;
        int M = m;
        while (M % 2 == 0) {
            ++index2;
            M /= 2;
        }
        while (M % 5 == 0) {
            ++index5;
            M /= 5;
        }

        int a = 9, len = 1;
        while (a % M != 0) {
            ++len;
            a = (10 * a + 9) % M;
        }

        BigDecimal bN = new BigDecimal(n);
        BigDecimal bM = new BigDecimal(m);
        String s = bN.divide(bM, 100, BigDecimal.ROUND_DOWN).toPlainString();
        int i = 0;
        for (i = 0; i < s.length(); i++) {
            int j = s.lastIndexOf(s.substring(i, i + len * 3));
            if (j >= 0 && j != i) {

                break;
            }
        }
        System.out.println(s);
        System.out.print(s.substring(0, i));
        System.out.print("(");
        System.out.print(s.substring(i, i + len));
        System.out.println(") ");
    }
}
