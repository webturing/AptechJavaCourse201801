package p65;

/**
 * 31将真分数分解为埃及分数
 * 分子为1 的分数称为埃及分数，现输入一个真分数，请将该分数分解为埃及分数。
 * 如：8/11=1/2+1/5+1/55+1/110。
 * 运行结果
 * 1. Please enter a optional fraction (a/b): 1/6
 * It can be decomposed to: 1/6
 * 2. Please enter a optional fraction (a/b): 20/33
 * It can be decomposed to: 1/2+1/10+1/165
 * 3. Please enter a optional fraction (a/b): 10/89
 * It can be decomposed to: 1/9+1/801
 * 4. Please enter a optional fraction (a/b): 19/99
 * It can be decomposed to: 1/6+1/40+1/3960
 * 5. Please enter a optional fraction (a/b): 8/89
 * It can be decomposed to: 1/11+1/957
 */
public class P31EygptFraction {
    static class Fraction implements Comparable<Fraction> {
        int up, down;
        static Fraction ZERO = new Fraction(0, 1);

        Fraction(String s) {
            this(Integer.parseInt(s.split("/")[0]), Integer.parseInt(s.split("/")[1]));
        }

        Fraction(int up, int down) {
            int g = Tools.gcd(up, down);
            up /= g;
            down /= g;
            this.up = up;
            this.down = down;
        }

        Fraction substract(Fraction that) {
            int up = this.up * that.down - this.down * that.up;
            int down = this.down * that.down;
            return new Fraction(up, down);

        }

        @Override
        public int compareTo(Fraction that) {
            long dif = this.up * that.down - this.down * that.up;
            return new Long(dif).compareTo(0L);
        }

        @Override
        public String toString() {
            return String.format("%d/%d", this.up, this.down);
        }
    }

    public static void main(String[] args) {
        egyptDivision(new Fraction("1/6"));
        egyptDivision(new Fraction("20/33"));
        egyptDivision(new Fraction("10/89"));
        egyptDivision(new Fraction("19/99"));
        egyptDivision(new Fraction("8/89"));
    }

    private static void egyptDivision(Fraction f) {
        System.out.print(f);
        boolean first = true;
        while (f.compareTo(Fraction.ZERO) > 0) {
            Fraction best = new Fraction(1, (f.down + f.up - 1) / f.up);
            if (first) {
                first = false;
                System.out.print("=");
            } else {
                System.out.print("+");
            }
            System.out.print(best);
            f = f.substract(best);
        }
        System.out.println();
    }
}
