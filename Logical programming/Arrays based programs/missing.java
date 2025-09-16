public class missing {
    static boolean Ismissing(int n, int a[])
    {
        for(int i=0;i<=a.length-1;i++)
        {
            if (a[i]==n)
            return false;

        }

        return true;
    }
    

    public static void main(String []args)
    {
        int a[]={5,2,8,4};
        int small=a[0];
        int big= a[0];
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]<small)
            {
                small= a[i];
            }

            if(a[i]>big)
            {
                big=a[i];
            }
        }

        for(int i=small+1;i<=big-1;i++)
        {
            if(Ismissing(i,a)== true)
            {
                System.out.println(i);
            }
        }
    }
}
