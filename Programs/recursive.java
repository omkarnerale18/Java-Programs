public class recursive {
    public static void  display()
    {
        System.out.println("Hello..... this is a recursion running");
        display();
    }

    public static void main(String [] args)
    {
        System.out.println("The main method is started");
        display();
        System.out.println("The main method ended");
    }
    
}
