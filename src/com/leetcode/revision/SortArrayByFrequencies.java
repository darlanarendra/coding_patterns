package com.leetcode.revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
 * 1636. Sort Array by Increasing Frequency
 */
public class SortArrayByFrequencies {

	public int[] frequencySort(int [] nums) {
		
		Map<Integer,Integer> map= new HashMap<>();
		for(int n:nums) {
			map.put(n,map.getOrDefault(n,0)+1);
		}
		
		return Arrays.stream(nums).boxed().sorted((a,b)->{
			if(a==b) return 0;
			if(map.get(a) == map.get(b)) return b-a;
			return map.get(a)-map.get(b);
		}).mapToInt(Integer::valueOf).toArray();		
	}
	
	public static void main(String [] args) {
		SortArrayByFrequencies arrayByFrequencies = new SortArrayByFrequencies();
		int []array = {2,2,2,1,1,1,3};
		System.out.println("SortArrayByFrequencies "+Arrays.toString(arrayByFrequencies.frequencySort(array)));
	}
}
