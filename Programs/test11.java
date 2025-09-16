public class test11 {
    public static void main(String[] args)
    {
        int phy=77; int che=76; int mat=87; int opt=66;
        double total=(phy+che+mat+opt);
        double perc=total/400*100;
        System.out.println("The total marks obtained  are: "+total);
        System.out.println("The percentage obtained is: "+perc);

        if( perc<35)
        {
            System.out.println("Fail");
        }
        else if( perc>=35 && perc<=60)
        {
            System.out.println("Pass with seconfd class");
        }
        else if( perc>=60 && perc<=80)
        {
            System.out.println("pass with Firsr class");
        }
        else
        {
            System.out.println("pass with distinction");
        }
    }
}
