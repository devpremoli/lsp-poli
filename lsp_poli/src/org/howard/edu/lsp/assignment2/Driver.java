package org.howard.edu.lsp.assignment2;

/*
 * Put comments about this file
 * 
 */

public class Driver {
	public static void main(String[] args) {
		Combination comb = new Combination();
		
		// Tests
		System.out.println("My input is: {5,5,15,10} and the target sum is 15");
		comb.combination(new int[] {5,5,15,10}, 15);
		
		System.out.println("My input is: {} and the target sum is 0");
		comb.combination(new int[] {}, 0);
		
		System.out.println("My input is: {} and the target sum is 10");
		comb.combination(new int[] {}, 10);
		
		System.out.println("My input is: {1, 4, 5, 7, 10} and the target sum is 3");
		comb.combination(new int[] {1,4,5,7,10}, 3);

		System.out.println("My input is: {3, 9, 7, 5, 6, 4, 2, 25, 10, 15} and the target sum is 25");
		comb.combination(new int[] {3, 9, 7, 5, 6, 4, 2, 25, 10, 15}, 25);
		
		System.out.println("My input is: {2, 4, 6, 8, 10} and the target sum is 10");
		comb.combination(new int[] {2, 4, 6, 8, 10}, 10);
		
		System.out.println("My input is: {10, 10} and the target sum is 20");
		comb.combination(new int[] {10, 10}, 20);
		
		System.out.println("My input is: {10, 20, 30} and the target sum is 20000");
		comb.combination(new int[] {10, 20, 30}, 20000);
		

	}
}