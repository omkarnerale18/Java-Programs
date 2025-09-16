import java.util.Scanner;
public class decitobin {

    static String decimaltobinary(int dec)
    {
        String bin="";
        while(dec>0)
        {
            int rem=dec%2;
            bin=rem+bin;
            dec=dec/2;
        }
        
        return bin;
    }

    public static void main(String[]args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a decimal  number");
        int dec= Scan.nextInt();
        String binary=decimaltobinary(dec);
        System.out.println("The decimal number converted to binary is:"+binary);
        Scan.close();
    }
}