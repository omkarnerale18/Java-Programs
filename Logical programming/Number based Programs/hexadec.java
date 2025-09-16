import java.util.Scanner;
public class hexadec {
    static String dectohexadecimal(int dec)
    {
        String hex="";
        while(dec>0)
        {
            int rem=dec%16;
            if(rem>9)
            {
                hex=(char)(rem+55)+hex;
            }
            else
            {
                hex=rem+hex;
            }
            dec=dec/16;
        }
            return hex;
    }


    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a deimal number to convert into Hexadecimal");
        int dec=sc.nextInt();
        String hex=dectohexadecimal(dec);
        System.out.println("The decimal number converted to hexadecimal is"+hex);
        sc.close();
    }
    
}
