import java.util.Arrays;
public class zigzagmerge {

    public static void main(String[] args)
    {
     int a []={10,20,30};
     int b[]={100,200,300};
 
     int d []=zigzag(a, b);
     System.out.println(Arrays.toString(d));
     
    }





    static int[] zigzag(int a[], int b[])
    {
        int c []= new int[a.length+b.length];

        int i=0,j=0,k=0;
        while(i<=a.length-1 && j<=b.length-1)
        {
            c[k]=a[i];
            k++;

            c[k]=b[j];
            i++;j++;k++;
        }

        while(i<=a.length-1)
        {
            c[k]=a[i];
            i++;k++;
        }


        while(j<=b.length-1)
        {
            c[k]=b[j];
            i++;j++;
        }

        return c;

    }


   
}
