package com.qiyi.biwangshen;

public class Solution {
//	public int reverse(int x){
//        long r = 0;
//        while(x != 0){
//            r = r*10 + x%10;
//            x /= 10;
//        }
//        if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
//            return (int)r;
//        else
//            return 0;
//    }
	public int reverse(int x) {
		long result;//注意一定要把result定义为long,否则result有可能因为溢出，导致
					//原本是0的输出不为0，因为会高位阶段
		if(x>0){
			result = solution(x);
		}else if(x == 0){
			return 0;
		}else{
			x=Math.abs(x);
			 result = -solution(x);
		}
		if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
			result =0;
		}
		return (int)result;
	}
	public long solution(int x){
//		int i =0;
		long result =0;
		while(x !=0){
			int tmp = x % 10;
			result =  result*10+tmp;
//			i++;
			x = x/10;
		}
		System.out.println();
		return result;
	}
}
