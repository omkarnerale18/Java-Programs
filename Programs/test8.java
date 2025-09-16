public class test8 {
    public static void main(String [] args)
    {
        int Total=0;
        int avg =0;
        int [] arr = {10,20,30,40,50};
        for(int i=0; i<arr.length; i++)
        {
           Total+=arr[i];

            
        }
        avg =Total/arr.length;
        System.out.println("Sum of array elements is:"+Total);
        System.out.println("Average is:"+avg);
    }
    
}
