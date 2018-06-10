package zj.util;

public class MathTool {

    public static final double EPS = 1e-6;

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
        //testGCD();
        System.out.println(safeMod(-8, 6));
        System.out.println(safeMod(8, 6));
        float f = 1.0f;
        float y = 0.12f + 0.880001f;
        System.out.println(fEqual(f, y));
    }

    private static boolean fEqual(float x, float y) {
        /// return x==y;//
        return Math.abs(x - y) <= EPS;
    }

    public static int safeMod(int a, int b) {
        return (a % b + b) % b; //程序语言取模缺陷
    }

    private static void testGCD() {
        System.out.println(2 == gcd(6, 8));
        System.out.println(2 == gcd(6, -8));
        System.out.println(33 == gcd(66, 99));
        System.out.println(6 == gcd(6, 0));
    }


}
