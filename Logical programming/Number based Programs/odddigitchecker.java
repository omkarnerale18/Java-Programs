import java.util.Scanner;

class odddigitchecker {

    static boolean odddigit_checker(int n)
    {
        while(n>0)
        {
            int rem=n%10;
            if(rem%2!=0)
            {
                return true;
            }

            n=n/10;
        }

        return false;
        
    }

public static void main(String[]args)
{
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a Numberr");
    int n= scan.nextInt();

    if(odddigit_checker(n)== true)
    {
        System.out.println("The number contains only odd digits");
    }

    else
    {

    System.out.println("The number doesn't contain only odd digits");
    }

    scan.close();
}
    
}
