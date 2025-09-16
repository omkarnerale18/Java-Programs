 class sumofdig {

    static void sum(int n)
    {
       while(n>=10){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;

        }n=sum;
       }
     System.out.println(n);

       
    }

    public static void main(String[] args) {
     sum(8876);
    }
    
}
