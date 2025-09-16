public class test19 {

    public static void main(String[]args)
    {
        int n = 5; // You can change this value

        for (int i = 1; i <= n; i++) {
            // Print dashes
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); //2spaces
            }
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            // Move to next line
            System.out.println();
        }
        
        }   
    }
    







