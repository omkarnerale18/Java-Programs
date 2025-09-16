public class pallindrome {

    static boolean Ispallindrome(int n)
    {
        int numb=n;
        int reversed=0;
        while(n>0)
        {
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }

        if (reversed== numb)
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
        int a[]={121,35,353,67,88,343};
        for(int i=0;i<=a.length-1;i++)
        {
            if(Ispallindrome(a[i])== true)
            {
                System.out.println(a[i]);
            }
        }
    }
    
}
