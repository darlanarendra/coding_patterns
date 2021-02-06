package com.leetcode.revision;

public class LicenceKeyFormatting {
	public String licenceKeyFormatting(String s, int K) {
		
		s = s.replaceAll("-", "");
		int length = s.length();
		int firstGroup = length/K;
		int nGroups = length%K;
		StringBuilder sb = new StringBuilder();
		sb.append(s.substring(0, firstGroup));
		if(firstGroup!= 0)
			sb.append("-");
		int ptr = firstGroup;
		for(int i = 0; i<nGroups; i++) {
			sb.append(s.substring(ptr,ptr+K));
			sb.append("-");
			ptr+=K;
		}
		return sb.length()>0&& sb.charAt(sb.length()-1) == '-'?sb.deleteCharAt(sb.length()-1).toString():sb.toString();
		
	}
}
