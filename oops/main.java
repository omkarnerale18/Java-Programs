 class graphpoint2d {
    double xaxis;
    double yaxis;

    graphpoint2d(double arg1,double arg2)
    {
        arg1=xaxis;
        arg2=yaxis;
    }


    void display()
    {
        System.out.println("The value of x cordinate is:"+xaxis);
        System.out.println("The value of y cordinate is:"+yaxis);

    }
    
}

  
    class  mainClass

    {
    public static void main(String[]args)
    {
        graphpoint2d p1=new graphpoint2d(5.5, 2.50);
        p1.display();
        graphpoint2d p2=new graphpoint2d(4.6,5.2 );
        p2.display();

    }

    }



