package com.question.four;

import java.util.Scanner;

/**
 * @author DHANUSHKA
 * This is Soundex Algorithm implementation class.
 * This class gets the surname from user and print the code. 
 */
public class SoundexImpl {
	
	// Main method
	public static void main(String[] args) {
		// Get the inputs from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert Surname : ");
		String surname = sc.nextLine();
		// Call getSoundexCode method from Soundex class.
		String soundexCode = Soundex.getSoundexCode(surname);
		System.out.println("\nSoundex code for '" + surname + "' is '" + soundexCode + "'.");
		sc.close();
	}

}
