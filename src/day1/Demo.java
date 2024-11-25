package day1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("START");
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		try
		{
			int rs=a/b;
			System.out.println("result is "+rs);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero error");
		}
		System.out.println("END");

	}

}
