package p65;
/**
 * 43  1~9分成1：2：3的三个3位数
 * 将1到9 这九个数字分成三个3位数，分求第一个3位数，正好是第二个3位数的二倍，是第三个3位数的三倍。问应当怎样分法。
 * <p>
 * 运行结果
 * No.1:192 384 576
 * No.2:219 438 657
 * No.3:273 546 819
 * No.4:327 654 981
 */

import java.util.Arrays;

public class P43Using1To9A {
    public static void main(String[] args) {

        for (int x = 123, cnt = 0; x <= 987 / 3; x++) {
            int y = x * 2;
            int z = x * 3;
            char[] digits = String.format("%d%d%d", x, y, z).toCharArray();
            Arrays.sort(digits);
            if (new String(digits).equals("123456789")) {
                System.out.println(String.format("No.%d:%d %d %d", ++cnt, x, y, z));
            }
        }
    }
}
