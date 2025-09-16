class product {
    static void productDigit(int n)
    {
        int prod=1;
        
        while(n>0)
        {
            int rem=n%10;
            prod*=rem;
            n=n/10;
        }
        System.out.println(+prod);
    }

    public static void main(String[]args)
    {
        product.productDigit(245);
    }
    
}
