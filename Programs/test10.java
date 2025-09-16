public class test10 {
    public static void main(String [] args)
    {
        int bankcode=3;
        int bal=500;
        int amnt=25000;
        boolean pancard= false;
        if(bal<amnt)
        {
            System.out.println("Withdraw not possible");
        }
        else System.out.println("withdraw processing...");
        if(amnt>=50000 || pancard==false)
        {
            System.out.println("Link pancard");
        }
        if(bankcode==1)
        {
          if (bal<1000)
          {
                System.out.println("Low balance");
                System.out.println(1000-bal+"Must be deposited to maintain minimum balance");
          }
        }
        else if(bankcode==3 || bankcode==4)
        {
            if (bal<5000)
            {
                System.out.println("Low minimum balance");
                System.out.println( 5000-bal+"Must be deposited to maintain minium balance");
            }
        }
    }
    
}
