public class test13 {
    public static void main(String[] args)
    {
        String carname =("Verna");
        int price=1345000;
        double tax=0;
        int insurance=0;
        int cc=1500;
        double Totalprice=0;
        if(price<=1000000)
        {
            tax=(price*0.25);
        }
        else if(price>=1000000 && price<=2000000)
        {
            tax=(price*0.32);
        }
        else if(price>=2000000 && price<=3000000)
        {
            tax=(price*0.39);
        }
        else if(price>=3000000)
        {
            tax=(price*0.42);
        }
        System.out.println("The total tax is:"+tax);
        
        if(cc<=1000)
        {
            insurance=(5780*5);
        }
        else if( cc>=1000 && cc<=2000)
        {
            insurance=(12950*5);
        }
        else if(cc>=2000 && cc<=3000)
        {
            insurance=(17850*5);
        }
        else if(cc>=3000)
        {
            insurance=(24950*5);
        }
         Totalprice=price+tax+insurance;
        System.out.println("The Car price is:"+price);
        System.out.println("The tax is:"+tax);
        System.out.println("The insurance for 5 years is:"+insurance);
        System.out.println("The on road price of the car is:"+Totalprice);
    }
    
}
