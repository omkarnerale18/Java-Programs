 class odddigit {
    
    static void odddigitprime(int n)
    {   
        int count=0;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem%2!=0)
            {
                sum+=rem;
            }
            n=n/10;
        }

        for(int i=1;i<=sum;i++)
        {
            if(sum%i==0)
            {
                count++;
            }
        }

        if(count==2)
        {
            System.out.println("Prime");
        }

        else
        {
            System.out.println("Not prime");
        }
    }

    public static void main(String[]args)
    {
        odddigitprime(1211);
    }
}
