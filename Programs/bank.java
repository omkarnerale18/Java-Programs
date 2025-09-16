public class bank
{
     static double acc_bal=20000;
    public static void withdraw()
    {
        int amnt=5000;
        if(acc_bal< amnt)
        {
            System.out.println("THe wiithdraw is not possible the account balance is less than amount");
        }
        else
        {
            acc_bal-=amnt;
            System.out.println("The withdraw is succesfull  "  +acc_bal);
            
        }

    }

    public static void deposit()
    {
        int dep=7000;
        acc_bal+=dep;
        System.out.println("THe balance after the deposit is: " + acc_bal);
    }
    public static void viewbalance()
    {
        System.out.println("The balance is: " + acc_bal);
    }

    public static void main(String[] args)
    {
        withdraw();
        deposit();
        viewbalance();
    }
}