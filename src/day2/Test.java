package day2;

public class Test {
static void display() throws Exception
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
		Thread.sleep(2000);
	}
}
public static void main(String[] args) 
{
	try
	{
	display();
	}
	catch(Exception e)
	{
		System.out.println("Handled");
	}
}
}
