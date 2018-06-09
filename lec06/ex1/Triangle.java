package lec06.ex1;

class Triangle {
    Point p, q, r;

    public static double getArea(Point p, Point q, Point r) {
        double a = p.getDistance(q);
        double b = p.getDistance(r);
        double c = q.getDistance(r);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static Point getMidCenter(Point p, Point q, Point r) {//poor design
        return null;
    }
}