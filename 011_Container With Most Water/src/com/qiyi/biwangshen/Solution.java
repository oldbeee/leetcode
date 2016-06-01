package com.qiyi.biwangshen;

public class Solution {
	public int maxArea(int[] height) {
		int length = height.length;
		int i=0,j=length-1;
		int result = 0,tmp=0;
		while(i<j){
			if(height[i]<height[j]){
				tmp = (j-i) * height[i];
				if(tmp>result)
					result = tmp;
				i++;
			}else {
				tmp = (j-i) * height[j];
				if(tmp > result)
					result = tmp;
				j--;
			}
		}
		return result;
	}
}
