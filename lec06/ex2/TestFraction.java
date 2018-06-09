package lec06.ex2;

public class TestFraction {
    public static void main(String[] args) {
        testRationalize();
        testAdd();


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
