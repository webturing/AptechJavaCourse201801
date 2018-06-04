package p65;

/**
 * 13  4位反序数
 * 设N是一个四位数，它的9倍恰好是其反序数，求N。反序数就是将整数的数字倒过来形成的整数。
 * 例如：1234的反序数是4321。
 * <p>
 * 运行结果
 * The number satisfied states condition is:1089
 */
public class P13FourDigitsReverseOrderNumber {
    public static void main(String[] args) {
        for (int n = 1000; n <= 9999 / 9; ++n) {
            if (Integer.toString(n).equals(Tools.getReverseString(Integer.toString(9 * n)))) {
                System.out.println("The number satisfied states condition is:" + n);
            }
        }
    }
}
