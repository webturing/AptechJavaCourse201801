package zj.util;

public class MathTool {
    /**
     * 计算 a,b的最大公约数
     *
     * @param a
     * @param b
     * @return
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println(2 == gcd(6, 8));
        System.out.println(2 == gcd(6, -8));
        System.out.println(33 == gcd(66, 99));
        System.out.println(6 == gcd(6, 0));
    }
}
