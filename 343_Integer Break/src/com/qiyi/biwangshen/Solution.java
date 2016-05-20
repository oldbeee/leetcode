package com.qiyi.biwangshen;

public class Solution {
	public int integerBreak(int n) {
		if(n==2){
			return 1;
		}else if(n==3){
			return 2;
		}else{
			int result =0;
			int mod = n % 3;
			int div = n/3;
			if(mod == 0){
				result = (int) Math.pow(3, div);
			}
			if(mod == 1){
				result = (int) Math.pow(3, div-1) * 4;
			}
			if(mod == 2){
				result = (int) Math.pow(3, div) *2;
			}
			return result;
		}
    }
}
