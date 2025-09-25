public class Fibonaccirecursion {
    static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    public static void main(String[]args){
        int terms=10;

        System.out.println("Fibonacci series upto:" + terms + "terms:");
        for(int i=0; i<terms; i++)
        {
            System.out.println(fibonacci(i) + " ");
        }


    } 
}
