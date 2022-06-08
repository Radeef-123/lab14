package syncronization;

public class synch {
	int total_seats=10;
	  
	  void  busTicket(int seats) {
		  if(total_seats>=seats)
		  {
			 System.out.println(seats+ "  Seats booked successfully");
			 total_seats=total_seats-seats;
			 System.out.println("seats left   " +total_seats);
			 
		  }
		  else {
			  System.out.println("Sorry Seats cannot be booked....!!");
			  System.out.println("seats left "+total_seats);		     
		  }
	  }

	}

	class BusTicketApp extends Thread
	{
	static  synch  b;	
	int seats;
	public void run()

	{
		
	b. busTicket(seats);

	}

	public static void main(String args[])
	  {
		b =new synch();
		
		 BusTicketApp t1 =new  BusTicketApp();
		t1.seats=7;
		t1.start();
		
		
		 BusTicketApp t2 =new  BusTicketApp();
		t2.seats=7;
		t2.start();
		
		
		
	   }
	}

	