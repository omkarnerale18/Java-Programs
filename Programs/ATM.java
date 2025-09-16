public class ATM {
    public static void main(String[] args)
    {
        double balance=10000;
        double withdraw= 4000;
        

        if(balance>=withdraw)
        
        {
            balance= balance-withdraw;
            System.out.println(" Withdraw is succesfull.The remaining balance is"+balance);
        }
        else
        {
            System.out.println(" Withdraw is not succesfull.The remaining balance is"+balance);
        }
    }
    
}
