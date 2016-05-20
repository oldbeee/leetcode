package com.qiyi.wangshenbi;

public class Solution {
	public String reverseVowels(String s){
		char[] a;
		a=s.toCharArray();
		int i=0;
		int j=a.length-1;
		while(i<j){
			if(isVowels(a[i])&&isVowels(a[j])){
				char tmp;
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				i++;
				j--;
			}else if(isVowels(a[i])){
				j--;
			}else{
				i++;
			}
		}
		String result = String.valueOf(a);
		return result;
	}
	private boolean isVowels(char word){
		if (word=='a'||word=='e'||word=='i'||
				word=='o'||word=='u'||word=='A'||
				word=='E'||word=='I'||word=='O'||
				word=='U'){
			return true;
		}else{
			return false;
		}
	}
}
