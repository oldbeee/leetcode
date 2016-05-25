package com.qiyi.biwangshen;

import java.util.Arrays;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] tmp = java.util.Arrays.copyOf(nums, nums.length);
		//int[] tmp = nums;
		Arrays.sort(nums);
		int i=0;
		int j=nums.length-1;
		while(i<j){
			if(nums[i]+nums[j]<target){
				i++;
			}
			if(nums[i]+nums[j]>target){
				j--;
			}
			if(nums[i]+nums[j]==target){
				break;
			}
		}
		int a = nums[i];
		int b = nums[j];
		int m =0;
		int n =0;
		boolean isa =true;
		boolean isb =true;
		for(int i1=0;i1<nums.length;i1++){
			if(tmp[i1] == a&&isa == true){
				m = i1;
				isa = false;
			}else if(tmp[i1] ==b&&isb == true){
				n =i1;
				isb =false;
			}
		}
		return new int[]{m,n};
	}
}
