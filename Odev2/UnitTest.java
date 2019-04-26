/*
 *Unittest Point ve Rectangle sınıflarının test edildigi sınıftır.
 */
package odev.pkg2;

/**
 *
 * @author muhammed
 */
public class UnitTest {
    
    public static void main(String[]args){
        Point[] a = new Point[5];
        Point b = new Point(3,1);
        a[0] = new Point(0,0);
        a[1] = new Point(1,1);
        a[2] = new Point(2,4);
        a[3] = new Point(3,3);
        a[4] = new Point(4,4);
        System.out.println(Point.findFurthest(a));
        System.out.println(b.findClosest(a));
        
        Rectangle kare = new Rectangle(1,30);
        System.out.println(kare.getArea());
        System.out.println(kare.getPerimeter());
    }
    
}
