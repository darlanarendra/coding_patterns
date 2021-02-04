package com.educative.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
/**
 * 22. Generate Parentheses
 * Given n pairs of parentheses, 
 * write a function to generate all combinations of well-formed parentheses.
 * @author narendradarla
 *
 */
public class GenerateParanthesis {

	public List<String> generateParanthesis(int n){
		List<String> result = new ArrayList<>();
		if(n == 0) {
			result.add("");
		}else {
			for(int c = 0; c<n; c++) {
				for(String left: generateParanthesis(c))
					for(String right:generateParanthesis(n-1-c))
						result.add("("+left+")"+right);
			}
		}
		return result;
	}
}
