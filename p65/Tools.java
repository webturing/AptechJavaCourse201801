package p65;

public class Tools {
    public static int square(int x) {
        return x * x;
    }

    public static int cube(int x) {
        return x * x * x;
    }

    public static int reverse(int n) {
        return Integer.parseInt(getReverseString(Integer.toString(n)));
    }

    public static boolean isSysmetric(int n) {
        return n == reverse(n);
    }

    public static boolean isSysmetric(String s) {
        return s.equals(getReverseString(s));
    }

    public static String getReverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(square(4));
        System.out.println(cube(4));
        System.out.println(reverse(1230));
        System.out.println(isSysmetric(121));
        System.out.println(lcm(3, 5, 7));
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int lcm(int... args) {
        if (args.length == 1)
            return args[0];
        if (args.length == 2)
            return args[0] * args[1] / gcd(args[0], args[1]);
        int s = 1;
        for (int arg : args) {
            s = lcm(s, arg);
        }
        return s;
    }


}
