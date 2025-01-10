package Dec_18_COVID19_VaccineBookingApplication;

public class CoronaVaccineApp 
{
	public static void main(String[] args) throws InterruptedException
	{
		User user1 = new User("OM", 21, true);
		User user2 = new User("Milind", 27, true);
		User user3 = new User("Rushi", 17, true);
				
		Thread t1 = new Thread( () -> 
		{
			try
			{
				user1.bookDose();
			}
			catch(RuntimeException e)
			{
				System.out.println(e.getMessage());
			}
		});
		
		
		Thread t2 = new Thread( () ->
		{
			try
			{
				user2.bookDose();
			}
			catch(RuntimeException e)
			{
				System.out.println(e.getMessage());
			}
		});
		
		
		Thread t3 = new Thread( () -> 
		{
			try
			{
				user3.bookDose();
			}
			catch(RuntimeException e)
			{
				System.out.println(e.getMessage());
			}
		});

		t1.start();
		t2.start();
		t3.start();
				
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
