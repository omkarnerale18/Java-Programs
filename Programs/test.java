class practice1
{
    public static void main (String[] args)
    {
        System.out.println("program started");
        float radius;
        final double pi;
        double area, circum, diameter;
        pi=3.14;
        radius=12.3f;
        diameter =2*radius;
        area=pi*radius*radius;
        circum=2*pi*radius;

        System.out.println("area of circle: " + area);
        System.out.println("circumference of circle: " + circum);
        System.out.println("diameter of circle: "+ diameter);
        System.out.println("program ended");
        


    }
}