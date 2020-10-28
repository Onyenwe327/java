import java.util.Scanner;
 
abstract class calcArea {
    abstract void findRectangle(double l, double b);
    abstract void findCircle(double r);
}
 
class findArea extends calcArea {
 
    void findRectangle(double l, double b)
    {
        double area = l*b;
        System.out.println("Area of Rectangle: "+area);
    }
     
    void findCircle(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
}
         
class area {
    public static void main(String args[])
    {
        double l, b, r;
        findArea area = new findArea();
        Scanner get = new Scanner(System.in);
 
        System.out.print("\nEnter Length & Breadth of Rectangle: ");
        l = get.nextDouble();
        b = get.nextDouble();
        area.findRectangle(l, b);
 
        System.out.print("\nEnter Radius of Circle: ");
        r = get.nextDouble();
        area.findCircle(r);
    }
}   