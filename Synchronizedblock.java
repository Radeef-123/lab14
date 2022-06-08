package syncronization;

public class Synchronizedblock {
	int total_seats=10;

	 void  busTicket(int seats) {
	   synchronized(this) {
		   
			  if(total_seats>=seats)
			  {
				 System.out.println(seats+ " Seats booked successfully");
				 total_seats=total_seats-seats;
				 System.out.println("seats left "+total_seats);
				 
			  }
			  else {
				  System.out.println("Sorry Seats cannot be booked....!!");
				  System.out.println("seats left "+total_seats);
					 
				  
			  }
	   }

	}
	}

	class Busseats extends Thread
	{
	static  Synchronizedblock   b;	
	int seats;
	public void run()

	{
		
	b. busTicket(seats);

	}

	public static void main(String args[])
	{
		b =new Synchronizedblock ();
		
		Busseats  t1 =new  Busseats ();
		t1.seats=7;
		t1.start();
		
		Busseats  t2 =new  Busseats ();
		t2.seats=7;
		t2.start();
		

		
	 }
	}


