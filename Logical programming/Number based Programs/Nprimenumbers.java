import java.util.Scanner;
public class Nprimenumbers {

    static boolean Isprime(int n)
    {
       
        if (n < 2) {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
           
            
        }

        return true;
    }

    static void printPrime(int num)
    {   
        int n=2;
        int count=0;
        while(count<num)
        {
        if(Isprime(n)==true)
        {
            System.out.println(n+" ");
            count++;
        }
           n++;
       }

        
    }


    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number of prime numbers to be printed");
        int num=scan.nextInt();
        printPrime(num);
        scan.close();
    }
    
}
