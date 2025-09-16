 class employees {
    int emp_id=1;
    String emp_name="Robin";
    int emp_age=48;
    int emp_sal=65000;
    double emp_exp=12.5;
    String emp_dept="Foundry";

    void updateage( int args)
    {
        System.out.println("updating the age");
        args=emp_age;
    }

    void updatesal(double args)
    {
        System.out.println("updating the salary");
        args=emp_sal;
    }

    void updateexp(double args)
    {
        System.out.println("Updating the Expierence");
        args=emp_exp;
    }
    
    void details()
    {
        System.out.println("employee id:"+emp_id+ "\n employee name:"+emp_name+ "\n employee salary:"+emp_sal+ "\n employee age:"+emp_age+ "\n employee exp:"+emp_exp+"\nemployee department:"+emp_dept);
    }
    
}

class mainclass
{
    public static void main(String[]args)
    {
        System.out.println("before updating:");
        System.out.println("------------------------------------------------");

        employees p1= new employees();
        p1.details();
        p1.emp_id=12;
        p1.emp_name="Alex";
        p1.emp_age=28;
        p1.emp_sal=450000;
        p1.emp_exp=2.5;
        p1.emp_dept="Casting";

        System.out.println("After updating:");
        System.out.println("------------------------------------------------");
        p1.details();


    

    }
}




