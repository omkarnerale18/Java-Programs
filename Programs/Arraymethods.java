public class Arraymethods {
   static int [] arr= {10,20,30,40,50,60,70,80,90,100};
    public static void fwd()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }



    }

    public static void bwd()
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void excpt()
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i==0 || i==9)
            {
                continue;
            }
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        fwd();
        bwd();
        excpt();
    }
}
