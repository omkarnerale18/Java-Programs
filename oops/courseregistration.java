 class courseregistration 
 {
    String studentname;
    long phno;
    String email;
    String course;

    courseregistration(String arg1,long arg2,String arg3,String arg4)
    {
        studentname=arg1;
        phno=arg2;
        email=arg3;
        course=arg4;
    }

    courseregistration(String arg1,long arg2,String arg4)
    {
        studentname=arg1;
        phno=arg2;
        course=arg4;
    }

    courseregistration(String arg1, String arg3,String arg4)
    {
        studentname=arg1;
        email=arg3;
        course=arg4;
    }

    void details()
    {
        System.out.println("StudentName:"+studentname+ "\nPhoneNO:"+phno+ "\nEmail-id:"+email+ "\nCourseName:"+course);
    }
    

}

class demo
{
    public static void main(String[]args)
    {
        courseregistration c1=new courseregistration("Ramesh",9113457835l,"Ramesh@gmail.com","AWS" );
        c1.details();
        courseregistration c2=new courseregistration("Suresh",91184546l,"JFSD" );
        c2.details();
        courseregistration c3=new courseregistration("Jaggesh","jaggesh@gmail.com","PFSD" );
        c3.details();


    }
}