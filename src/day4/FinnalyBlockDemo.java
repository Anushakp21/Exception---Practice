package day4;

public class FinnalyBlockDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		finally {
			System.out.println("Inside Finally Block");
		}
		System.out.println("end");

	}

}
