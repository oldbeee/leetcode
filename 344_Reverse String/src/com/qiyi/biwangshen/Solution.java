package com.qiyi.biwangshen;

public class Solution {
	public String reverseString(String s) {
		char[] array = s.toCharArray();
		int i=0;
		int j=array.length-1;
		while(i<j){
			char tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
			i++;
			j--;
		}
		String result = String.valueOf(array);
		return result;
	}
}
