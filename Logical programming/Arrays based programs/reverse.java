import java.util.Arrays;
public class reverse {
    static  int reversed (int a[])
    {
        int i=0;int j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++; j--;
        }
            return a[i];
        
    }
    
    public static void main(String []args)
    {
        int a[]={10,20,30,40,50};
        reversed(a);
        System.out.println(Arrays.toString(a));
    }
}
