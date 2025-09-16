public class Nunique {

    public static void main(String[]args)
    {
        int n=2;
        int uniquelecount=0;
        int a[]={10,20,10,30,40,20};
         boolean b[]=new boolean[a.length];

         for(int i=0;i<=a.length-1;i++)
         {
            if(b[i]==false)
            {
                int count=1;
                {
                    for(int j=i+1;j<=a.length-1;j++)
                    {
                        if(a[i]==a[j])
                        {
                            count++;
                            b[j]=true;
                        }
                    }

                    if(count==1)
                    
                    uniquelecount++;

                    if(uniquelecount==n)
                    System.out.println(a[i]);
                    break;
                   
                }
            }
         }
    }

    
}
