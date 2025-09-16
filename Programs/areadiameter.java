public class areadiameter {
    static int radius=12; static double pi=3.142;
    public static void area()
    {
        double area = pi*(radius*radius);
        System.out.println("Area of the circle is: " + area);

    }

    public static void diameter()
    {
         double diameter= 2*radius;
         System.out.println("Diameter: " + diameter);
    }

    public static void circumference()
    {
        double circumference=2*pi*radius;
        System.out.println("The circumference of the circle is: " + circumference);
    }
    public static void main(String[] args)
    {
        area();
        diameter();
        circumference();
    }
    
}
