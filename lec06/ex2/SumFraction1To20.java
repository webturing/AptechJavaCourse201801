package lec06.ex2;

public class SumFraction1To20 {
    public static void main(String[] args) {
        Fraction sum = Fraction.ZERO;
        for (int i = 1; i <= 20; i++) {
            sum = sum.add(new Fraction(1, i));
        }
        System.out.println(sum);

    }


}
