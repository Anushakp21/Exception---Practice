package day2;

public class Demo {

	public static void main(String[] args) {
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("invalid Denominator");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invali");
		}
		catch(Exception e)
		{
			System.out.println("Super class Handled");
		}
		

	}

}
