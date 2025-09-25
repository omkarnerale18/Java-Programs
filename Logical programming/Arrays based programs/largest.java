public class largest
{
    public static void main(String[]args)
    {
        int a[]={10,20,30,40};
        int large=a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            if (a[i]>large)
            {
                large=a[i];
            }
        }
        System.out.println(large);
    }
}