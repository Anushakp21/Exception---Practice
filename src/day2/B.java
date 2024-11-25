package day2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class B {

	public static void main(String[] args) {
		try {
			FileReader f=new FileReader("demo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not Found");
			
		}

	}

}
