 class demo2 {
    int x=100;
    int y=200;
    
    void test()
    {
        System.out.println("test ()methon of demo2 class is running");
    }
    
}
class maindemo2
{
    public static void main(String[] args)
    {
        demo2 ref1;
        ref1=new demo2();
        System.out.println("x value is:"+ref1.x);
        System.out.println("y value is:"+ref1.y);
        ref1.test();


        ref1.x=150;
        ref1.y=250;

        System.out.println("The value of x is:"+ref1.x);
        System.out.println("The value of y is:"+ref1.y);


        demo2 s2;
        s2= new demo2();

        System.out.println("The value of x is:"+s2.x);
        System.out.println("The value of y is:"+s2.y);

    }
}
