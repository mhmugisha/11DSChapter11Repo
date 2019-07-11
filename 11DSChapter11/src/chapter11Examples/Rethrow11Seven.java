package chapter11Examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rethrow11Seven {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
	int number;
	
	try 
	{
		number = getNumber();//Execution resumes here after method throws exception. The exception is now caught by the catch in main and outputs the statement. 
		System.out.println("Number = " + number);
	}
	
	catch(InputMismatchException imeRef) {
		System.out.println("Exception:" + imeRef.toString());
	}
		
	}
/*________________________________________________________________________*/	
	//Method getNumber. 
	
	public static int getNumber() throws InputMismatchException
	{
		int num;
	
		try 
		{
		System.out.println("Enter integer:");
		num = console.nextInt();//When u enter an invalid x-cter here, the exception created is caught by the catch statement below. 
		System.out.println();
		return num;
		}
		
		catch(InputMismatchException imeRef)//Catches exception. 
		{
			throw imeRef;//But does not process it - instead throws it to main where the method getNumber is called.
		}
	}
}
