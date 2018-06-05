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
    }
}
