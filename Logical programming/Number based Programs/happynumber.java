import java.util.Scanner;
public class happynumber {
    static boolean ishappy(int n)
    {
        int sum=0;
        while(n>=10)
        {
        while (n>0)
        {
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        n=sum;
         }

         if(n==1)
         {
            return true;
           
         }
         else
         {
            return false;
         }
    }

    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
         if (ishappy(n)== true)
         {
            System.out.println(" is Happynumber");
         }

         else
         {
            System.out.println("Not happynumber");
         }
         
        scan.close();
    }
    
}
