public class factorial {
     static void factorialofno(int n)
     {
        int fact=1;
        if(n==0 || n==1)
        {
            System.out.println("factorial=1");
        }
        for(int i=2;i<=n;i++)
        {
            fact*=i;
        }

        System.out.println("The factorial of" +n+ " is:" +fact);
        
     }
    
}
class mainclass{
    public static void main(String[]args)
    {
       factorial.factorialofno(3);
    }
}
