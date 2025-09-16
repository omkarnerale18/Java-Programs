public class strong {
    public static void main(String[]args)
    {
        int a[]={145,1,28,40585,6};
        Isstrong(a);
    }


     static int SumOfFact(int n)
     {
        int sum=0;
       
        
           
            while(n>0)
            {
                int rem= n%10;
                int fact=1;
                for(int j=1;j<=rem;j++)
                {
                    fact*=j;
                }
                sum+=fact;
                n=n/10;
            }
               
            
        

        return sum;
       
     }
    static void Isstrong(int a[])
    {
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
        
        if(SumOfFact(a[i])== a[i])
        {
            sum+=a[i];
            System.out.println("The Strong numbers preent in the array are:"+a[i]);
            

        }

        

    }

    System.out.println("The sum of Strong numbers present in the array is: "+sum);
        

        
    }
    
}
