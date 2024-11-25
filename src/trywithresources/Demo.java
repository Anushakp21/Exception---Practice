package trywithresources;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println(name);
	}
}
}
