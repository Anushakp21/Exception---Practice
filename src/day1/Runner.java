package day1;

public class Runner {

	public static void main(String[] args) {
		System.out.println("START");
		int[] a= {10,20,30};
		try
		{
			System.out.println(a[100]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index Position");
		}
		System.out.println("END");

	}

}
