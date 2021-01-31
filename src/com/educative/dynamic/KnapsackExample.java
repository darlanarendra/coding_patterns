package com.educative.dynamic;

public class KnapsackExample {

	public static void main(String[] args) {
		int weights [] = {1,2,3};
		int credits [] = {3,4,5};
		int capacity = 5;
		KnapsackExample knapsackExample = new KnapsackExample();
		System.out.println("Knapsack Example Result"+knapsackExample.solveKnapsack(weights, credits, capacity));
	}
	
	public int solveKnapsack(int [] weights, int [] credits, int capacity) {
		return knapsackRecursive(weights, credits, capacity,0);
		
	}
	
	private int knapsackRecursive(int[] weights, int [] credits, int capacity, int index) {
		if(capacity <= 0 || index>= credits.length) return 0;
		
		int credits1 = 0;
		if(weights[index]<=capacity) {
			credits1 = credits[index]+knapsackRecursive(weights, credits, capacity-weights[index], index+1);
		}
		
		int credits2 = knapsackRecursive(weights, credits, capacity, index+1);
		
		return Math.max(credits1,credits2);
	}
}
