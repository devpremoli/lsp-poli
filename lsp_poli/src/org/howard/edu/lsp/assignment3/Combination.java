package org.howard.edu.lsp.assignment3;

import java.util.ArrayList;

public class Combination {
	static boolean[][]check;
	public void combination(int[] input, int sum) {
		int n = input.length;
		ArrayList<Integer> list = new ArrayList<Integer>(input.length);
		for (int i = 0; i < input.length; i++)
		  list.add(Integer.valueOf(input[i]));
		if (n == 0) {
			System.out.println("[]");
			return;
		}

		
		check = new boolean[n][sum +1];
		for (int i =0; i<n; ++i) {
			check[i][0] = true;
		}
		if (input[0] <=sum) {
			check[0][input[0]] = true;
		}
		for (int i =1; i <n; ++i)
			for (int j = 0; j <sum +1; ++j)
				check[i][j] = (input[i]<= j) ? (check[i-1][j] || check[i-1][j-input[i]]) : check[i-1][j];
		if (check[n-1][sum] == false){
			System.out.println("[]" );
			return;
		}
		ArrayList<Integer> arr = new ArrayList<>();
		helper(input, n-1, sum, arr);
		
	}
	static void helper(int input[], int i, int sum, ArrayList<Integer> num) {
		if (i ==0 && sum !=0 && check[0][sum]) {
			num.add(i);
			System.out.println(num);
			num.clear();
			return;
		}
		if (i == 0 && sum == 0) {
			System.out.println(num);
			num.clear();
			return;
		}
		if (check[i-1][sum]) {
			ArrayList<Integer> container = new ArrayList<>();
			container.addAll(num);
			helper(input, i-1, sum, container);
		}
		if (sum >= input[i] && check[i-1][sum-input[i]]) {
			num.add(i);
			helper(input, i-1,sum-input[i],num);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Print this");
	}
}