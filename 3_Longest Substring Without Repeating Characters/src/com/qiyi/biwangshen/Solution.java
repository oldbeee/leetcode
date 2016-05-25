package com.qiyi.biwangshen;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
	    int ret = 0;
	    Map<Character, Integer> map = new HashMap<>();
	    for (int i = 0, start = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (map.containsKey(c)) 
	            //start = Math.max(map.get(c)+1, start);
	        	start = map.get(c)+1;
	        ret = Math.max(ret, i-start+1); 
	        map.put(c, i);
	    }
	    return ret;
	}
}
