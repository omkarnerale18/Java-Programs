public class recursive1 {
    public static void display(int num)
    {
        System.out.println(num);
        if(num<10)
        {
            display(++num);
        }
    }
    public static void main(String[] args)
    {
        display(1);
    }
    
}
