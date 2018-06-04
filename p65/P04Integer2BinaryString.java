package p65;

/**
 * 4数制转换
 * 将任一整数转换为二进制形式
 * <p>
 * 运行结果
 * 输入：8
 * 输出：
 * number of decimal form:8
 * it's bunary form:0000000000001000
 * 输入：-8
 * 输出：number of decimal form:-8
 * it's binary form:1111111111111000
 * 输入：32767
 * 输出：number of decimal form:32767
 * it's binary form:0111111111111111
 * 输入：-32768
 * 输出：number of decimal form:-32768
 * it's binary form:1000000000000000
 * 输入：128
 * 输出：number of decimal form:128
 * it's binary form:0000000010000000
 */
public class P04Integer2BinaryString {
    final static int BIT_WIDTH = 32;

    static String decimalToBinary(int num) {
        StringBuffer buffer = new StringBuffer();
        boolean isNegative = (num < 0);
        if (isNegative) {
            num *= -1;
        }
        for (int i = BIT_WIDTH - 1; i >= 0; i--)
            buffer.append((num >> i) & 1);
        if (!isNegative)
            return buffer.toString();
        for (int i = 0; i < BIT_WIDTH; i++) {
            buffer.setCharAt(i, (char) ('1' - buffer.charAt(i) + '0'));
        }
        int sc = 1;
        for (int i = BIT_WIDTH - 1; i >= 0; i--) {
            int t = buffer.charAt(i) - '0' + sc;
            sc = t >> 1;
            buffer.setCharAt(i, (char) ((t & 1) + '0'));
        }
        return buffer.toString();
    }


    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++)
            System.out.println(decimalToBinary(i) + "  " + String.format("%32s", Integer.toBinaryString(i)));
    }
}
