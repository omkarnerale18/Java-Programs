public class totalprice {
    public static void price()
    {
        double [] price={499,599,299,99,899};
        double totalprice=0;
        double gst=0.18;
        double totalpricewith_gst;
        for(int i=0;i<price.length;i++)
        {
           
            totalprice+= price[i];
        }
        totalpricewith_gst= totalprice+totalprice*gst;
        System.out.println("total price is:"+totalpricewith_gst);

    }
        public static void main(String[] args)
        {
            price();
        }
    
}
