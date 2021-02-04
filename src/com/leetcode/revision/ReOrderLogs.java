package com.leetcode.revision;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * dig1 8 1 5 1
 * let1 art can 
 * dig2 3 6
 * let2 own kit dig
 * let3 art zero
 * 
 * Output:
 * let1 art can
 * let3 art zero
 * let 2 own kit dig
 * dig1 8 1 5 1
 * dig2 3 6
 * 
 */
public class ReOrderLogs {
	
	
	public String[] reorderLogFiles(String [] logs) {
		
		Comparator<String> comparator = new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				String [] s1 = o1.split(" ", 2);
				String [] s2 = o2.split(" ", 2);
				boolean isDigit1 = Character.isDigit(s1[1].charAt(0));
				boolean isDigit2 = Character.isDigit(s2[1].charAt(0));
				if(isDigit1 != isDigit2) {
					return isDigit2?-1:1;
				}else if(!isDigit1 && !isDigit2) {
					return s1[1].compareTo(s2[1])!=0?s1[1].compareTo(s2[1]):s1[0].compareTo(s2[0]);
				}else
					return 0;
			}
			
		};
		
		Arrays.sort(logs, comparator);
		return logs;
	}
}
