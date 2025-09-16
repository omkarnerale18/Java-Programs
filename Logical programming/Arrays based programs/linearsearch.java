public class linearsearch {
    static int LinearSearch(int a[],int ele)
    {
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]==ele)
            {
                return i;
            }

           
        }
        return -1;
    }

    public static void main(String[]args)
    {
        int a[]={10,20,30,40,50};
        int ele=40;
        int index= LinearSearch(a, ele);
        if(index==-1)
        {
            System.out.println("The element is not found");
        }

        else
        {
            System.out.println("The element is present at"+index+"Index");
        }
    }
    
}
