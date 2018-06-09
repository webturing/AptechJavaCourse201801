package lec06.ex2;

public class TestFraction {
    public static void main(String[] args) {
        //testRationalize();
        // testAdd();
        Fraction sum = Fraction.ZERO;
        for (int i = 1; i <= 20; i++) {
            sum = sum.add(new Fraction(1, i));
        }
        System.out.println(sum);

    }

    private static void testAdd() {
        System.out.println(new Fraction(1, 6).add(new Fraction(1, 3)));
        System.out.println(new Fraction(3, 6).add(new Fraction(-1, -3)));
    }

    private static void testRationalize() {
        System.out.println(new Fraction(9, 18));
        System.out.println(new Fraction(9, -18));
        System.out.println(new Fraction(-9, 18));
        System.out.println(new Fraction(-9, -18));
    }
}
