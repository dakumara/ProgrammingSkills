package com.question.two;

import java.util.Scanner;

/**
 * @author DHANUSHKA
 * This class solve the Quadratic equation.
 */
public class Quadratic {

	// Main method starts here.
	public static void main(String[] args) {
		// Get the inputs from user
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("Enter the values for quadratic equation :");
		
		// Get values for 'a', 'b' and 'c'
		try {
			System.out.print("a : ");
			a = Double.parseDouble(sc.nextLine());
			System.out.print("b : ");
			b = Double.parseDouble(sc.nextLine());
			System.out.print("c : ");
			c = Double.parseDouble(sc.nextLine());
		
		// If invalid input, catch the exception and exit.
		} catch (Exception e) {
			System.out.println("Invalid input, Try again");
			return;
		}
		// Create determinant value.
		double determinantVal = Math.pow(b, 2) - 4 * a * c;
		
		if (determinantVal == 0) {		// If determinant value is zero.
			System.out.println("Root value is : " + -b / (2 * a));
		} else if (determinantVal > 0) {  	// If determinant value greater than zero.
			System.out.println("Root values are " + (-b + Math.sqrt(determinantVal)) / (2 * a) + " and "
					+ (-b - Math.sqrt(determinantVal)) / (2 * a));
		} else {
			System.out.println("No real root values");
		}
		// Closing scanner object
		sc.close();
	}

}
