public class test5 {
    public static void main(String[] args)
    {
        double prod= 2500.00;
        double totalprice;
        double totalprice_withgst;

        totalprice = prod*3;
        totalprice_withgst = totalprice+(totalprice*0.18);
        System.out.println("Total price"+totalprice);
        System.out.println("totalprice with gst:"+totalprice_withgst); 

    }
    
}
