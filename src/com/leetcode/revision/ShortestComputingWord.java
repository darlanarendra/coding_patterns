package com.leetcode.revision;

public class ShortestComputingWord {
	public String shortestCompletingWord(String licensePlate, String[] words) {
        int [] map = new int[26];
        int count  = 0;
        for(char c: licensePlate.toCharArray()){
            if(c>='a' && c<='z'){
                count++;
                map[c-'a']++;
            }else if(c>= 'A' && c<='Z'){
                count++;
                map[c-'A']++;
            }
        }
        String result = null;
        int minLen = Integer.MAX_VALUE;
        for(String s :words){
            int [] m = new int[26];
            int ct = 0; 
            for(char c:s.toCharArray()){
                if(m[c-'a']<map[c-'a']){
                    m[c-'a']++;
                    ct++;
                    if(ct==count){
                        if(s.length() < minLen){
                            result = s;
                            minLen = s.length();
                        }
                        break;
                    }
                }
            }
        }
        return result;
    }
}
