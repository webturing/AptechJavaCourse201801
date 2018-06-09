package lec06.ex2;

public class SumFraction1To202 {
    public static void main(String[] args) {
        Fraction sum = Fraction.ZERO;
        for (int i = 1; i <= 10; i++) {
            Fraction f = new Fraction(1, i);
            if (i % 2 == 0)
                f.up *= -1;
            sum = sum.add(f);
        }
        System.out.println(sum);

    }


}
