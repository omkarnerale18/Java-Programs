public class test {
    public static void main(String[]args)
    {
        
        int a[]={10,15,20,17,25,23};
        for(int i=0;i<=a.length-1;i++)
        {
            int count=0;
            for(int j=1;j<=a[i];j++)
            {
            if(a[i]%j==0)
            {
                count++;
            }
        }
            if(count==2)
            {
                System.out.println(a[i]);
            }
        }
    }
    
}
