class Demo1
{
    static int x=10;
    int y=100;
    static void test()
    {
        System.out.println("the test method is running");
    }


    void disp()
    {
        System.out.println("The disp function is running");
    }

}



class mainclass
{
    public static void main(String[] args)
    {
        System.out.println("main method started");
        System.out.println("the value of x is:"+Demo1.x);

        Demo1.x=20;

        System.out.println("The value of x is:"+Demo1.x);

        new Demo1().y=200;
        System.out.println("The value of y is:"+ new Demo1().y);




        System.out.println("main method ended");

    }

}