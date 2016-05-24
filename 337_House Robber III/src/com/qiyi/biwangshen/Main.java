package com.qiyi.biwangshen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode hori11 = new TreeNode(2);
		TreeNode hori21 = new TreeNode(2);
		TreeNode hori22 = new TreeNode(3);
		TreeNode hori32 = new TreeNode(3);
		TreeNode hori34 = new TreeNode(1);
		hori11.left=hori21;
		hori11.right=hori22;
		hori21.right=hori32;
		hori22.right=hori34;
		Solution solution = new Solution();
		int result = solution.rob(hori11);
		System.out.println(result);
		}

}
