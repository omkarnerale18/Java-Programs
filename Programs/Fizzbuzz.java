public class Fizzbuzz {
    public static void main(String[] args)
    {
        int i = 16;
        if (i%3==0 && i%5==0 )
        {
            System.out.println("FizzBuzz");
        }
        else if (i%3==0)
        {
            System.out.println("Fizz");

        }
        else if (i%5==0)    
        {
            System.out.println("buzz");
        }
        System.out.println("Not divisible by both 3 and 5");
    }
    
}
