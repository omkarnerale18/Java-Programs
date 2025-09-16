public class Powercalculation {

    static int power(int n,int p)
    {
        int res=1;
        for(int i=0;i<p;i++)
        {
            res=res*n;
        }
        return res;
         
        
    }
        
   
}

class Mainclass{
    public static void main(String []args)
    {
       
        int val=Powercalculation.power(2,3);
        System.out.println("The value is:"+val);
    }
}
