package lec06.ex2;

public class Fraction {
    int down;
    int up;

    //
    public Fraction(int up, int down) {
        this.up = up;
        this.down = down;
    }

    public Fraction() {
//        this.up = 0;
//        this.down = 1;
        this(0, 1);

    }

    public String toString() {
        return String.format("%d/%d", up, down);
    }

    public Fraction add(Fraction that) {
        int up = this.up * that.down + this.down * that.up;
        int down = this.down * that.down;
        return new Fraction(up, down);
    }
}
