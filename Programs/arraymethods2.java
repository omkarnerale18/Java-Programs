public class arraymethods2 {
    static int [] arr={10,20,30,40,50,60,70,80,90,100};

    
    public static void  excpt()
    {
        int i=0;
        for(i=0;i<arr.length;i++)
        if(i==0|| i==1 ||i==9 || i==8)
        {
            continue;
        }
        System.out.print(arr[i]+" ");
    }

    public static void frst_half()
    {
        for(int i=0;i<=4;i++)
        System.out.print(arr[i]+" ");
    }

    public static void scnd_half()
    {
        for( int i=5;i<=9;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        excpt();
        frst_half();
        scnd_half();
        
    }
    
}
