package day3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThroeDemo {
	static void read() throws FileNotFoundException
	{
		FileReader f=new FileReader("car.txt");// FileNotFoundException 
	}

	public static void main(String[] args) {
		try
		{
			read();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
