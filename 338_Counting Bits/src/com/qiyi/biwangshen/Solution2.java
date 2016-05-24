package com.qiyi.biwangshen;
//此题用动态规划会得到时间复杂度O(n)
public class Solution2 {
	public int[] countBits(int num) {
		int[] result = new int[num+1];
		result[0] = 0;
		if(num == 0)
			return result;
		result[1] = 1;
		if(num == 1)
			return result;
		result[2] = 1;
		if(num == 2)
			return result;
		int count =1;
		int start =2;
		for(int i=3;i<num+1;i++){
			if(count == start){
				result[i] = count = 1;
				start =i;
			}else{
				result[i] = result[start] + result[count];
				count ++;
			}
		}
		return result;
	}
}
