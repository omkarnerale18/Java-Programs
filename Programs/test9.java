/**Write a program to find a number in a given array.Program should give output as below.
(i) if number is found, display message "the number is found in the array"
(ii) if number is not foound in the array, display message"number is not found the array"
*/

public class test9{
    public static void main( String[] args)
    {
        int[] arr= {10,20,30,40};
        int num=30;
        boolean isloopBreaked=false;
        for (int i=0;i<arr.length;i++);
        {
            if(num==arr[i])
            {
                isloopBreaked=true;
                break;
            }
        }
        if(isloopBreaked== true)
    {
        System.out.println("The number is found in the array");
    }
}
    }
    