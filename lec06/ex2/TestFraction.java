package lec06.ex2;

public class TestFraction {
    public static void main(String[] args) {
        Fraction f = new Fraction(1, 6);
        System.out.println(f);
        Fraction g = new Fraction(1, 3);
        System.out.println(g);
        //Fraction ret1=Fraction.add(f,g);
        Fraction ret2 = f.add(g);
        System.out.println(ret2);
        //   System.out.println("helloworld".substring(0,3));
        Fraction sum = new Fraction();//sum=0;
        for (int i = 1; i <= 5; i++) {
            Fraction ff = new Fraction(1, i);
            sum = sum.add(ff);
        }
        System.out.println(sum);

    }
}
