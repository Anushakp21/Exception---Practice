package day2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example {
	void readData() throws FileNotFoundException
	{
		FileReader f=new FileReader("demo.txt");
	}
	public static void main(String[] args) {
		Example e1=new Example();
		try
		{
		e1.readData();
		}
		catch(Exception e)
		{
			System.out.println("File not Found");
		}
	}

}
