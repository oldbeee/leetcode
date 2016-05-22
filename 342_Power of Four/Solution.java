package com.qiyi.biwangshen;

public class Solution {
	public boolean isPowerOfFour(int num) {
		int signal = 0x55555555;
		if((num &(num-1))==0 && (num & signal)>0){
			return true;
		}
		return false;
        
    }
}
