import java.util.Arrays;
public class ascending {
    public static void main(String []args)
    {
        int a[]={10,8,6,7};

        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=i+1;j<=a.length-1;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(a));
    }
    
}
