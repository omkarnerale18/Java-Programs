public class test15 {
    public static void main(String[]args)
    {
        
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2==0)
                {
                    System.out.print((char)(i+64)+" ");
                }

                else
                {
                    System.out.print(i+" ");
                }

                
            }
            System.out.println();
        }
    }
    
}
