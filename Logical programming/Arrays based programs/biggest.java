public class biggest {
    public static void main(String[]args)
    {
          
        int a[]={10,20,30,40};
        int big=a[0];
        
            for (int i=1;i<=a.length-1;i++)
            {
                if(a[i]>big)
                {
                    big=a[i];
                }
            }
        System.out.println(big);
    }
    
}
