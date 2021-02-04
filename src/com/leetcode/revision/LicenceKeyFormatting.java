package com.leetcode.revision;

public class LicenceKeyFormatting {
	public String licenceKeyFormatting(String s, int K) {
		
		s = s.replaceAll("-", "");
		int length = s.length();
		int firstGroup = length/K;
		int nGroups = length%K;
		StringBuilder sb = new StringBuilder();
		
		
		
		
		return s;
		
	}
}
