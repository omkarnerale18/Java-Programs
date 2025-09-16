public class methods1 
    {
        public static int square(int num)
        {
            int res=num*num;
            System.out.println("square:"+res);  
            return 0; 
        }

        public static void form(int a,int b)
        {
           int result =square(a)+square(b)+(2*a*b);
           System.out.println("result is:"+result);

        }

        
        
        
        
        
        
        
        
        
        
        public static  void main(String[] args)
        {
            square(4);
            form(5,6);
            
        }

       
    
}
