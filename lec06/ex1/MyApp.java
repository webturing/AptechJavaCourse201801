package lec06.ex1;

public class MyApp {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 3;
        p.y = 4;// p=(3,4)
        Point q = new Point();
        q.x = 3;
        q.y = 0;//q(3,0)
        Point r = new Point();
        r.y = 4;//r=(0,4);
        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(r.toString());
        System.out.println(Triangle.getArea(p, q, r));
        Point midCenter = Triangle.getMidCenter(p, q, r);


    }


}
