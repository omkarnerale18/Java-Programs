public class smallest
{
    public static void main(String[]args)
    {
        int a[]={10,20,30,40};
        int small=a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            if (a[i]<small)
            {
                small=a[i];
            }
        }
        System.out.println(small);
    }
}