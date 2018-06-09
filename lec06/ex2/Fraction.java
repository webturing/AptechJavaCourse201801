package lec06.ex2;

public class Fraction {
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction ONE = new Fraction(1, 1);
    int down = 1;
    int up;

    public Fraction(int up, int down) {
        this.up = up;
        this.down = down;
        this.rationalize();
    }

    public Fraction() {
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

    /**
     * 分数化简方法
     * 1. 消去 up down的公因子（最大公约数)
     * 2.如果up down 异号 up=-ABS(up) down=ABS(down)
     */
    public void rationalize() {
        int g = zj.util.MathTool.gcd(up, down);
        up /= g;
        down /= g;
        if (1L * up * down < 0) {
            up = -Math.abs(up);
            down = Math.abs(down);
        } else {
            up = Math.abs(up);
            down = Math.abs(down);
        }
    }
}
