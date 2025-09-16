public class prime {
    static boolean Isprime(int n)
    {
        if(n<1)
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
        int a[]={10,15,20,17,25,23};
        for(int i=0;i<=a.length-1;i++)
        {
            if(Isprime(a[i])== true)
            {
                System.out.println(a[i]);
            }
        }
    }
    
}
