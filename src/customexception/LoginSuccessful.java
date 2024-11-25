package customexception;

import java.util.Scanner;

public class LoginSuccessful {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the User name");
		String id=sc.next();
		System.out.println("Enter the password");
	    int password=sc.nextInt();
	    if(id.equals("admin"))
	    {
	    	if(password == 123)
	    	{
	    		System.out.println("Login Successful");
	    	}
	    	 else
	 	    {
	 	    	try
	 	    	{
	 	    	InvalidPasswordException obj=new InvalidPasswordException();
	 	    	 throw obj;
	 	    	}
	 	    	catch(InvalidPasswordException e )
	 	    	{
	 	    		System.out.println("Password Invalid");
	 	    	}
	 	    }
	    }
	   
	}

}
