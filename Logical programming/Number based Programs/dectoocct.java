import java.util.Scanner;
public class dectoocct
{
    static String decitooct(int dec)
    {
        String oct="";
        while(dec>0)
        {
            int rem=dec%8;
            oct=rem+oct;
            dec=dec/2;
        }
            return oct;
    }

    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the decimal number to convert into octal");
        int dec=scan.nextInt();
        String oct=decitooct(dec);
        System.out.println("The decimal number converted to octal is:"+oct);
        scan.close();;
    }
}