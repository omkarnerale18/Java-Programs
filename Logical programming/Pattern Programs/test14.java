public class test14 {
    public static void main(String[]args)
    {
        int x=1;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%4d",x);
                x++;
            }
            System.out.println();
        }
    }
    
}
