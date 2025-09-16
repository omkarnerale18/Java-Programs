 import java.util.Scanner;
 class Armstrong {
    static void Armstrongnumber(int n)
    {
        int orgno=n;
        int sum=0;
        String s=  n+"";
        int cd=s.length();
        while(n>0)
        {
            int rem =n%10;
            int pow= (int) Math.pow(rem, cd);
            sum+=pow;
            n=n/10;
        }

        if(sum==orgno)
        {
            System.out.println("It is armstrong number");
        }
        else{
            System.out.println("It is not a armstrong number");
        }

    }

    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        Armstrongnumber(n);
        scan.close();
    }
    
}
