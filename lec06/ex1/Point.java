package lec06.ex1;

public class Point {
    double getDistance(Point that) {
        int dx = this.x - that.x;
        int dy = this.y - that.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    int x;
    int y;

    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
