package com.qiyi.biwangshen;

public class Solution {
	public String convert(String s, int numRows) {
		char[] array = s.toCharArray();
		int length = s.length();
		if(length==0||numRows<2)
			return s;
		// char[] result =new char[array.length];
		String a = "";
		// result[0] = array[0];
		int tag = 2 * numRows - 2;
		// for (int i=0;tag<s.length();i++){
		// tag = 0 + 2*numRows-2;
		// result[i] = array[tag];
		for (int i = 0; i < numRows; i++) {
			for (int j = i; j < length; j = j + tag) {
				a += array[j];
				if (i > 0 && i < numRows-1) {	//注意这个减一
					int tmp = j + tag - 2 * i;
					if (tmp < length) {
						a += array[tmp];
					}
				}
			}
		}
		return a;
	}
}
