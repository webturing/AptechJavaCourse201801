package p65;

/**
 * 12 一个奇异的三位数
 * 一个自然数的七进制表达式是一个三位数，而这个自然数的九进制表示也是一个三位数，且这两个三位数的数码正好相反，求这个三位数。
 * <p>
 * 运行结果
 * The special number with 3 digits is:503(7)=305(9)=248(10)
 */
public class P12Strange3DigitsNumber {
    public static void main(String[] args) {
        for (int n = 10 * 10; n <= 7 * 7 * 7 - 1; ++n) {
            String seven = Integer.toString(n, 7);
            String nine = Integer.toString(n, 9);
            String rSeven = new StringBuffer(seven).reverse().toString();
            if (nine.equals(rSeven)) {
                System.out.println(String.format("%d(10)=%s(7)=%s(9)", n, seven, nine));
            }
        }

    }
}
