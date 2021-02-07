package com.leetcode.revision;

import java.util.HashMap;
import java.util.Map;

public class LongestAbsoluteFilePath {

	public int longestAbsoluteFilePath(String input) {
		//"dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"
        int res = 0 ;
        Map<Integer, Integer> map = new HashMap();
        map.put(0,0);
      
        for(String s: input.split("\n")){
            int level = s.lastIndexOf("\t")+1; //1
            int len = s.substring(level).length();//7
            if(s.contains(".")){
                res = Math.max(res, map.get(level)+len);
            }else{
                map.put(level+1,map.get(level)+len+1);
            }
        }
        
        return res;
	}
	
	public static void main(String[] args) {
		LongestAbsoluteFilePath absoluteFilePath = new LongestAbsoluteFilePath();
		System.out.println("Absolute Path "+absoluteFilePath.longestAbsoluteFilePath("dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext"));
	}

}
