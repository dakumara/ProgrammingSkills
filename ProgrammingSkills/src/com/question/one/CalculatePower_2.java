package com.question.one;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author DHANUSHKA
 * THis class finds the value of the Number raised to the Power
 *
 */
public class CalculatePower_2 {

	public static void main(String[] args) {
		// Create Scanner object to get the inputs from user
		Scanner sc = new Scanner(System.in);

		// Starts try block to catch any exceptions.
		try {
			// Insert base value
			System.out.println("Please insert base value : ");
			int baseVal = sc.nextInt(); // Read base value

			// Insert exponent value
			System.out.println("Please insert exponent value : ");
			int expoVal = sc.nextInt(); // Read exponent value

			// Print result value
			System.out.println("\nPower of the inserted number is : " + getPowerValue(baseVal, expoVal));

			// If user input invalid value, exception will be occurred
		} catch (InputMismatchException e) {
			System.out.println("Inserted value is not a number...!");
		}

		// Finally, close the scanner object
		sc.close();
	}

	
	/**
	 * This method finds the value of the Number raised to the Power
	 */
	private static int getPowerValue(int baseVal, int expoVal) {
		int returnVal = 1;
		// With while loop, find to the power value.
        while (expoVal != 0) {
        	returnVal *= baseVal;
            --expoVal;
        }		
		return returnVal;
	}
}
