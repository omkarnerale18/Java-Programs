public class Notebook 
{
String color;
String Brand;
double Price;
int pages;
String Ruled_or_unruled;

 void open()
{
System.out.println("opening the book");
}

 void  close()
{
System.out.println("closing the book");

}

 void turnpages()
{
System.out.println("turning the pages");

}
 void tearpages()
{
System.out.println("tearing the pages");

}
}

class mainclass{
    public static void main(String[]args)
    {
        Notebook n1= new Notebook();
        n1.color="blue";
        n1.Brand= "classmate";
        n1.Price= 60;
        n1.pages= 200;
        n1.Ruled_or_unruled="unruled";
        System.out.println(n1.Brand);
        System.out.println(n1.color);
        System.out.println(n1.Price);
        System.out.println(n1.pages);
        System.out.println(n1.Ruled_or_unruled);
        n1.open();
        n1.tearpages();




    }
}
