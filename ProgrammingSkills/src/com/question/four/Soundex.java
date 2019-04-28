package com.question.four;

/**
 * @author DHANUSHKA
 * This class resolves the soundex algorithms
 */
public class Soundex {
	
	/**
	 * This method gets the surname from user and return soundex code
	 * @param str
	 * @return soundex code
	 */
	public static String getSoundexCode(String str) {
		// Make the string upper case and create char array
		char[] arr = str.toUpperCase().toCharArray();
		// Assign first character
		char firstChar = arr[0];

		// implement RULE NO 1 (replace letters with numbers)
		for (int i = 1; i < arr.length; i++) {

			switch (arr[i]) {
			case 'B':
			case 'F':
			case 'P':
			case 'V': {
				arr[i] = '1';
				break;
			}

			case 'C':
			case 'G':
			case 'J':
			case 'K':
			case 'Q':
			case 'S':
			case 'X':
			case 'Z': {
				arr[i] = '2';
				break;
			}

			case 'D':
			case 'T': {
				arr[i] = '3';
				break;
			}

			case 'L': {
				arr[i] = '4';
				break;
			}

			case 'M':
			case 'N': {
				arr[i] = '5';
				break;
			}

			case 'R': {
				arr[i] = '6';
				break;
			}

			default:
				arr[i] = '0';
				break;
			}
		}

		// Convert char letter to string.
		String returnCode = Character.toString(firstChar);

		// implement RULE NO 2 and Rule no 3
		// Identify identical digits
		for (int j = 1; j < arr.length; j++) {

			// Handle array index out of bound exception
			if (j > 1) {
				// Check digit, '0' or same adjacent digits or '0' with two same
				// digits in sides.
				if (arr[j] != '0' && arr[j - 1] != arr[j] && !(arr[j] == arr[j - 2] && arr[j - 1] == '0')) {
					returnCode += arr[j];
				}

			} else {
				if (arr[j] != '0' && arr[j - 1] != arr[j]) {
					returnCode += arr[j];
				}
			}

		}

		// implement RULE NO 4(return the correct code)
		// Append four '0' s to the end.
		returnCode = returnCode.concat("0000");

		// Return first four digits.
		return returnCode.substring(0, 4);

	}
}
