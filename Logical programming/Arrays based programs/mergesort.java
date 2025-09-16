import java.util.Arrays;
public class mergesort {


    static int[] Mergesort(int a[],int b [])
    {
        int c []= new int[a.length+b.length];
        int i=0,j=0,k=0;

        while(i<=a.length-1 && j<=b.length-1)
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                k++;i++;
            }

            else
            {
                c[k]=b[j];
                k++;j++;
            }
        }

        while(i<=a.length-1)
        {
            c[k]=a[i];
           i++; k++;
        }

        while(j<=b.length-1)
        {
            c[k]=b[j];
            j++;k++;
        }

        return c;

    }

    public static void main(String[]args)
    {
        int a[]={20,40,30,60};
        int b[]={300,200,100};
        int d[]=Mergesort(a, b);
        System.out.println(Arrays.toString(d));
    }
    
}
