public class evenarray {
    static int arr[]= {1,2,3,4,5,6};

    public static void evenindx()
    {
        for(int i=0; i<arr.length; i+=2)
        {
         
            System.out.println(arr[i]+" ");
        }
    }

    public static void sum()
    {
        int i=0;
        int sum = 0;
        for(i=0;i<arr.length;i++);
        {
        
            System.out.println(sum+=arr[i]);
            
        }
    }
    public static void main(String [] args)
    {
        evenindx();
        sum();
    }

    
}
