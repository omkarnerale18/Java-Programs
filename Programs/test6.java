public class test6 {
public static void main(String[] args)    {
        char Grade = 'C';

        switch(Grade)
        {
            case 'a':
            case 'A': System.out.println("First Class with Distinction");
                        break;
            case 'b':            
            case 'B': System.out.println("Second Class with Dist");
                          break;
            case 'c':
            case 'C': System.out.println("Third Class");
                          break;
                          
                          default: System.out.println("Fail");
        }
    }
    
}
