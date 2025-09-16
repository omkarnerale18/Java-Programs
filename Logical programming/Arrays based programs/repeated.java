public class repeated {
    public static void main(String[]args)
    {
        int maxcount=0;
        int ele=0;
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

                    if(count>maxcount)
                   maxcount=count;
                   ele=a[i];

                   
                   
                }
                System.out.println(ele);
            }       

           
         }
    }
    
}
