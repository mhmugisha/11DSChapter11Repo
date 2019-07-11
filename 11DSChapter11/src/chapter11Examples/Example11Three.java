package chapter11Examples;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Example11Three {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividend, divisor, quotient;
		
		try
		{
			System.out.println("Enter dividend:");
			dividend = console.nextInt();
			
			System.out.println("Enter divisor:");
			divisor = console.nextInt();
			
			quotient = dividend/divisor; 
			System.out.println("Quotient = " + quotient);
		}
		
		catch(ArithmeticException ae) 
		{
		System.out.println("Can't divide by zero!");
		System.out.println("Exception: " + ae);
		System.out.println("Exception: " + ae.toString());
		}
		catch(InputMismatchException inpte) 
		{
			System.out.println("Not an Integer!");
			System.out.println("Exception: " + inpte);
			System.out.println("Exception: " + inpte.toString());
		}

	}

}
