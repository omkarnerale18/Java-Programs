class pallindrome {
    static void reverse(int n)
    {   
        int num=n;
        int reversed=0;
        while (n>0)
        {
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }

        if(reversed==num)
        {
            System.out.println("The Entered number is pallindrome");
        }
        else
        {
            System.out.println("The entered number is not pallindrome");
        }

    }

    public static void main(String[]args)
    {
        pallindrome.reverse(121);
    }
    
}
