package com.qiyi.biwangshen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 solution = new Solution2();
		int num = 2;
		int[] result=solution.countBits(num);
		//System.out.println(result);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
