public class perfectnumber {
    static void perfect(int x){
        int sum = 0;
        for(int i = 1;i<=x/2;i++){
            if(x%i==0)
                sum+=i;
        }
        
        if(sum==x)
            System.out.println(x+" Is Perfect");

        else
            System.out.println(x+" Is Not Perfect");
    }

    public static void main(String[] args) {
        perfectnumber.perfect(6);
    }
    
}
