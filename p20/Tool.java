package p20;

public class Tool {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);

    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
