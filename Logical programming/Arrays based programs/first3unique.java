public class first3unique {

    public static void main(String[]args)
    {
        int uniquelecount=0;
        int a[]={10,20,10,30,40,50};
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
                    System.out.println(a[i]);
                    uniquelecount++;

                    if(uniquelecount==3)
                  
                    break;
                   
                }
            }
         }
    }

    
}
