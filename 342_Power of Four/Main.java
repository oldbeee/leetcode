package com.qiyi.biwangshen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean signal = false;
		Solution solution = new Solution();
		int num1 = 1;
		int num2 = 5;
		signal = solution.isPowerOfFour(num1);
		System.out.println(signal);
		signal = solution.isPowerOfFour(num2);
		System.out.println(signal);
	}

}
