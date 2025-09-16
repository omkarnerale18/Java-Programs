public class test12 {
    public static void main(String[] args)
    {
        int shirt1=899; int shirt2=499; int shirt3=799;
        int pant1=1899; int pant2=2199; int pant3=2599;
        int shirtprice= (shirt1+shirt2+shirt3);
        int pantprice=(pant1+pant2+pant3);
        double discs=0;
        double discp=0;
        

        if( shirtprice<2000)
        {
            discs=(shirtprice*0.1);
        }
        else if(shirtprice >=2000 && shirtprice <=3000)
        {
            discs=(shirtprice*0.2);
        }
        else if (shirtprice>=3000 && shirtprice<=4000)
        {
            discs=(shirtprice*0.25);
        }
        else if (shirtprice>=4000);
        {
            discs=(shirtprice*0.3);
        }

        double shirtfinalprice=(shirtprice-discs);
        

        if(pantprice<=3000)
        {
            discp=(pantprice*0.2);
        }
        else if(pantprice>=3000 && pantprice<=4000)
        {
            discp=(pantprice*0.25);
        }
        else if( pantprice>=4000 && pantprice<=5000)
        {
            discp=(pantprice*0.30);
        }
        else if(pantprice>=5000)
        {
            discp=(pantprice*0.40);
        }

        double pantfinalprice=(pantprice-discp);

        System.out.println("the shirt discount is"+discs);
        System.out.println("the pant discount is"+discp);
        System.out.println("the total amount to be paid is"+(shirtfinalprice+pantfinalprice));
        
    }
    
}
