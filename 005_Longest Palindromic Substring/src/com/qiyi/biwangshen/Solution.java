package com.qiyi.biwangshen;

public class Solution {
	public String longestPalindrome(String s) {
		char[] temp = s.toCharArray();
		int length = s.length();
		String result = "";
		if(s.isEmpty())
			return null;
		if(s.length()==1)
			return s;
		for(int i=0;i<length;i++){
			String str = isPalindromes(s,i,i);
			if(str.length()>result.length())
				result = str;
			str = isPalindromes(s,i,i+1);
			if(str.length()>result.length())
				result = str;
		}
		return result;
	}
	public String isPalindromes(String s,int i,int j){
		while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
			i--;
			j++;
		}
		return s.substring(i+1, j--);
	}
}