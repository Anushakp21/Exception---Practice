package day3;

public class ThrowDemo2 {

	static void display() throws InterruptedException 
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void main(String[] args) {
		try
		{
			display();
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}

	}

}
