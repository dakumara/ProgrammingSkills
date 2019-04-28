package com.question.one;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author DHANUSHKA 
 * This class finds the value of the Number raised to the Power
 */
public class CalculatePower {

	// Main methods starts here
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

			int tempVal; // Declare temporary value
			
			// If exponent is 0, the answer should be 1.
			if (expoVal == 0) {
				tempVal = 1;
				
			} else {
				tempVal = baseVal; // Assign vase value to the temporary value

				// With the for loop, increase and multiple base and exponent values
				for (int i = 1; i < expoVal; i++) {
					tempVal = tempVal * baseVal;
				}
			}

			// Print result value
			System.out.println("\nPower of the inserted number is : " + tempVal);

			// If user input invalid value, exception will be occurred
		} catch (InputMismatchException e) {
			System.out.println("Inserted value is not a number...!");
		}

		// Finally, close the scanner object
		sc.close();
	}

}
