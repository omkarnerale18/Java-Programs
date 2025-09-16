import java.util.Scanner;
public class nearestprime {
    static boolean isprime(int n)
    {
        if(n<=1)
        {
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
       public static void main(String[]args)
    {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =Scan.nextInt();
        Scan.close();
        if(isprime(n)==true)
        {
            System.out.println(n);
            return;
        }
       

        int pre=n-1; 
        int next=n+1;
    
        while(true)
        {
            if(isprime(pre)==true)
            {
                System.out.println(pre);
                break;
            }
    
            if(isprime(next)==true)
            {
                System.out.println(next);
                break;
            }
            pre++;
            next++;
        
        }
       
    
    }
}
