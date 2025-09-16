public class arraymethods3 {
    public static void sum()
    {
        int arr[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++)

        {
             
             
             sum= sum+arr[i];
            
            

        }
        System.out.println("The sum of elements of array is:"+sum);
    }

    public static void oddsum()
    {
        int arr1 []={1,2,3,4,5,6,7};
        int sum1=0;
        for(int i=0;i<arr1.length;i++)
        {
            if (arr1[i]%2!=0)
            {
                sum1= sum1+arr1[i];
            }
        }
        System.out.println("The sum of odd elements of array is:"+sum1);
    }

    public static void main(String[] args)
    {
        sum();
        oddsum();
    }
    
}
