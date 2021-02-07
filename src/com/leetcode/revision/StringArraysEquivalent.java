package com.leetcode.revision;

public class StringArraysEquivalent {


	
	public boolean isStringArraysEquivalent(String [] array1, String [] array2) {
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(String str:array1) {
			sb1.append(str);
		}
		for(String str:array2) {
			sb2.append(str);
		}
		return sb1.toString().equals(sb2.toString());
	}
}
