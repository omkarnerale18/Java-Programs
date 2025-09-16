 class TicketCounter {
    int no_of_tickets;
    int ticket_counter;

    TicketCounter(int no_of_tickets,int ticket_counter)
    {
        System.out.println("creating ticketcounter with:"+no_of_tickets+ "tickets and counter number is:"+ticket_counter);
        this.no_of_tickets=no_of_tickets;
        this.ticket_counter=ticket_counter;
    }

    void viewavailaibleTickets()
    {
        System.out.println("tickets availaible:"+no_of_tickets);
    }

    void buytickets(int n)
    {
        System.out.println("Buying"+n+ "tickets");
        if(n<no_of_tickets)
        {
            no_of_tickets-=n;
        }
        else{
            System.out.println("Buying tickets failed,insufficient tickets");
        }
    }

    void canceltickets(int n)
    {
        System.out.println("cancelling"+n+"tickets");
        no_of_tickets+=n;
    }
    
}

class Mainclass{
    public static void main(String[]args)
    {
        TicketCounter tc1=new TicketCounter(100, 1);
        tc1.viewavailaibleTickets();
        tc1.buytickets(10);
        tc1.buytickets(20);
        tc1.buytickets(10);
        tc1.viewavailaibleTickets();
        tc1.buytickets(100);
        tc1.canceltickets(10);
        tc1.viewavailaibleTickets();


    }
}
