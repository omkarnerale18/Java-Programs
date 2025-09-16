 class neon {
    static void neonnumber(int n)
    {   
        int sum=0;
       int sqr=n*n;
       while(sqr>0)
       {
        int rem=sqr%10;
        sum+=rem;
        sqr=sqr/10;
        
       }

       if (sum== n)
        {
            System.out.println("The number is neon number");
        }

        else{
            System.out.println("The number is not neon number");
        }

    }

    public static void main(String[]args)
    {
        neon.neonnumber(9);
    }
    
}
