package chapter11Examples;

//import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example11Five {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			int dividend, divisor, quotient;
			System.out.println("Enter dividend:");
			dividend = console.nextInt();
			
			System.out.println("Enter divisor:");
			divisor = console.nextInt();
			
			quotient = dividend/divisor;
			System.out.println("Quotient = " + quotient);
		}
		
		catch(Exception eRef) {
			if(eRef instanceof ArithmeticException)
			System.out.println("Exception: " + eRef.toString());
			
			else if(eRef instanceof InputMismatchException)
				System.out.println("Exception: " + eRef.toString());
		}
	}

}
