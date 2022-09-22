package org.howard.edu.lsp.assignment2;

/*
 * Put comments about this file
 * 
 */

public class Driver {
	public static void main(String[] args) {
		Combination comb = new Combination();
		comb.combination(new int[] {5,5,15,10}, 15);
		comb.combination(new int[] {}, 0);
		comb.combination(new int[] {}, 10);
		comb.combination(new int[] {1,4,5,7,10}, 3);
		comb.combination(new int[] {2, 4, 6, 8, 10}, 10);
		comb.combination(new int[] {10, 10}, 20);
		comb.combination(new int[] {10, 20, 30}, 20000);
	}
}