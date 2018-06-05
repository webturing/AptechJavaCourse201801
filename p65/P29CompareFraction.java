package p65;

/**
 * 29分数比较
 * 比较两个分数的大小。
 * <p>
 * 运行结果
 * 输入： 4/5，6/7 输出： 4/5<6/7
 * 输入： 8/4，16/32 输出： 8/4>16/32
 * 输入：16/32，4/8 输出： 16/32=4/8
 */
public class P29CompareFraction {
    static class Fraction implements Comparable<Fraction> {
        int up, down;

        Fraction(String s) {
            this(Integer.parseInt(s.split("/")[0]), Integer.parseInt(s.split("/")[1]));
        }

        Fraction() {
            this(0, 1);
        }

        public Fraction(int up, int down) {
            this.up = up;
            this.down = down;
        }

        @Override
        public int compareTo(Fraction that) {
            long dif = this.up * that.down - this.down * that.up;
            return new Long(dif).compareTo(0L);
        }
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction("1/2");
        Fraction fraction2 = new Fraction("2/3");
        System.out.println(fraction1.compareTo(fraction2));
    }
}
