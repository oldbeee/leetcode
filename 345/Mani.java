package com.qiyi.wangshenbi;

public class Mani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,5,3,2,3,2};
		int b[] = {1,3};
		Solution solution = new Solution();
		int[] result = solution.intersection(a, b);
		//System.out.println(result.length);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
	}

}
