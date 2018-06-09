package lec06.oop;

public class Point {
    int x;
    int y;

    double r() {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.x = 3;
        p.y = 4;
        //p.show();
        Point q = new Point();
        // q.show();
        double y = Math.sqrt(2);
        System.out.println(Point.getDistance(p, q));
        System.out.println(p.r());
        System.out.println(q.r());

    }

    static double getDistance(Point p, Point q) {
        int dx = p.x - q.x;
        int dy = p.y - q.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    void show() {
        System.out.print(this.x + " " + this.y);
    }

}
