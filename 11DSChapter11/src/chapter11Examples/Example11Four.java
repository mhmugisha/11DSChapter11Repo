package chapter11Examples;

import javax.swing.JOptionPane;

public class Example11Four {

	public static void main(String[] args) {
		
		try {
		int dividend, divisor, quotient;
		String inputString;
		
		inputString = JOptionPane.showInputDialog("Enter the dividend:");
		dividend = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("Enter the divisor:");
		divisor = Integer.parseInt(inputString);
		
		quotient = dividend/divisor;
		
 		JOptionPane.showMessageDialog(null, "Dividend = " + dividend + "\n"
 				+ "Divisor = " + divisor + "\n" + "Quotient = " + quotient, "Quotient:",
 				JOptionPane.INFORMATION_MESSAGE);
		}
		
		catch(ArithmeticException aeRef) 
		{
		JOptionPane.showMessageDialog(null, "Exception: " + aeRef, "ArithmeticException:",
				JOptionPane.ERROR_MESSAGE);
		}

		catch (NumberFormatException nfeRef) 
		{
		JOptionPane.showMessageDialog(null, "Exception " + nfeRef.toString(),
		"NumberFormatException:", JOptionPane.ERROR_MESSAGE); 
		}
		System.exit(0); 
	}

}
