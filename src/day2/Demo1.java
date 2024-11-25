package day2;

public class Demo1 {
	static void div() throws ArithmeticException
	{
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		System.out.println("START");
		try
		{
		div();
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		
		System.out.println("END");
	}

}
