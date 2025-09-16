import java.util.Scanner;
 class circle {
    double radius;
    final static double pi=3.14;

    circle()
    {
        System.out.println("creating circle with radius 0");
    }

    circle(double radius)
    {
        System.out.println("creating a circle with radius:"+radius);
        this.radius=radius;
    }

    void diameter()
    {
        double dia=2*radius;
        System.out.println("the diameter of the circle is:"+dia);

    }

    void area()
    {
        double area=pi*Math.pow(radius,2);
        System.out.println("The area of the circle is:"+area);
    }

    void circumference()
    {
        double circ=2*pi*radius;
        System.out.println("The circumference is:"+circ);
    }

    void updateradius(double radius)
    {
        System.out.println("updating the radius");
        this.radius=radius;
    }
    
}

public class Mainclass{

    public static void main(String []args)
    {
        circle c1=new circle();
        c1.diameter();
        c1.area();
        c1.circumference();

        circle c2=new circle();
        c2.diameter();
        c2.area();
        c2.circumference();


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius=scan.nextDouble();
        circle  c3=new circle(radius);
        c3.diameter();
        c3.area();
        c3.updateradius(5);
        c3.circumference();
        scan.close();

    }
}
