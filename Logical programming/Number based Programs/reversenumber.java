 import java.util.Scanner;
 class reversenumber {
    static void reverse(int n)
    {
        int reversed=0;
        while (n>0)
        {
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }
        System.out.println("The reversed String is:"+reversed);
    }

    public static void main(String[]args)
    {
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter the number");
       int n =scan.nextInt();
       reversenumber.reverse(n);
       scan.close();
    }
    
    
}
