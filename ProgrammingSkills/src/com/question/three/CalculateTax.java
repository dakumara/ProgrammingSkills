package com.question.three;

import java.util.Scanner;

/**
 * @author DHANUSHKA 
 * This class determines the original price from selling price and percentage.
 */
public class CalculateTax {

	public static void main(String[] args) {
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Determine original price...");

		try {
			// Get the inputs from user
			System.out.println("Insert tax inclusive price : ");
			double priceWithTax = sc.nextDouble();

			System.out.println("Insert tax percentage : ");
			double taxPercentage = sc.nextDouble();

			// Call the method findTaxExclusivePrice
			double originalPrice = findTaxExclusivePrice(priceWithTax, taxPercentage);
			System.out.println("Original Price is : " + originalPrice);

		} catch (Exception e) {
			System.out.println("Invalid input, Try again");
			return;
		}
		sc.close();
	}

	
	/**
	 * This method calculate Original price from selling price and percentage.
	 * @param priceWithTax, taxPercentage
	 * @return original price
	 */
	private static double findTaxExclusivePrice(double priceWithTax, double taxPercentage) {
		return (priceWithTax * 100) / (100 + taxPercentage);
	}

}
