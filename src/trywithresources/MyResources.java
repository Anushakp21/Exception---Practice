package trywithresources;

public class MyResources implements AutoCloseable {

	@Override
	public void close() throws Exception {
			System.out.println("Resource closed");
		
	}
	public void doSomething()
	{
		System.out.println("Using resources");
	}
	public static void main(String[] args)  {
		try(MyResources mr=new MyResources())
		{
			mr.doSomething();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
