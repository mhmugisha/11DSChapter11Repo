package chapter11Examples;

import java.util.Scanner;

public class Example11FiveMine {

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
			
			int[] nums = new int [3];
			nums[4] = 10;
			
			System.out.println(nums[4]);
		}
		
		catch(Exception genException) {
			System.out.println("Exception: " + genException);
		}
	}

}
