 class mobile {
    String Brand="Samsooooong";
    double price=15000;
    int storage=64;
    String os= "android";
    String version="11.15.14";

    void update_price(double arg)
    {
        System.out.println("Updating the price of the mobile");
        arg=price;
    }

    void update_storage( int arg)
    {
        System.out.println("updating the storage of the mobile");
        arg= storage;
    }

    void update_version(String arg)
    {
        System.out.println("updating the version of the mobile");
        arg=version;

    }

    void details()
    {
        System.out.println("brand:" +Brand+  " \n os:" +os+  "\nStorage:"+storage+  "\nVersion:"+version+  "\nprice:"+price);
    }
    
}

 class mainclass
{
    public static void main(String[]args)
    {
        mobile m1=new mobile();
        System.out.println("before updating ");
        m1.details();

        m1.price=35000;
        m1.os="13.25.14";
        m1.storage=128;
        m1.Brand="apple";

        System.out.println("after updating");

        m1.details();

    }
}
