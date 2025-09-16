 class demo3 {
    int x=100;
    int y=200;

    static void test()
    {
        System.out.println("The test method of demo 3 class is running");
    }
    
}

class maindemo3{
    public static void main(String[] args)
    {
        demo3 d1;
        d1= new demo3();
        System.out.println(d1.x);
        System.out.println(d1.y);

        d1.x=150;
        d1.y=250;

        System.out.println(d1.x);
        System.out.println(d1.y);

        demo3 d2;
        d2=new demo3();
        System.out.println(d2.x);
        System.out.println(d2.y);



        

       
    }
}
