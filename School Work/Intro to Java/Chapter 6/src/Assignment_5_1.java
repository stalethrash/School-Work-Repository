/*
 * Author: Ronald Waite
 * Date: 25 April 2015
 * Company: Bellevue University
 * File Name: Assignment_5_1.java
 * Description: This program demonstrates overloaded methods with a simple set
 * 		of methods that return the sums of integers.
 */
public class Assignment_5_1 {
	public static void main(String[] args) {
		System.out.println(sum(2,5)); // Test first 'sum' method
		System.out.println(sum(3,4,5)); // Test second 'sum' method

		// An array of integers to test the third 'sum' method
		int[] numberArray = {
			2, 5, 6, 3, 2, 8, 10, 23
		};
		System.out.println(sum(numberArray)); // Test the third 'sum' method
	}

	// Method 'sum' that takes two integers and returns their sum
	static int sum(int x, int y) {
		return x + y;
	}

	// Takes three integers and returns their sum
	static int sum(int x, int y, int z) {
		return x + y + z;
	}

	// Takes an array of integers and returns their sum
	static int sum(int [] numberArray) {
		int sum = 0; // Stores the sum over each iteration over the values of the array
		for (int number: numberArray) {
			sum += number; // Increments the sum by the next value in array 'x'
		}
		return sum; // Returns the final sum
	}
}
