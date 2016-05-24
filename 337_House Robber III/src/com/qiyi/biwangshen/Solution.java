package com.qiyi.biwangshen;

public class Solution {
	public int rob(TreeNode root) {
		int[] maxVal =dpRob(root);
		return Math.max(maxVal[0], maxVal[1]);
	}
	public int[] dpRob(TreeNode root){
		if(root == null){
			return new int[]{0,0};
		}else{
			int[] maxVal = new int[2];
			int[] leftMax = dpRob(root.left);
			int[] rightMax = dpRob(root.right);
			maxVal[0] = Math.max(leftMax[0], leftMax[1])+Math.max(rightMax[0],rightMax[1] );
			maxVal[1] = leftMax[0] + rightMax[0] + root.val;
			return maxVal;
		}
	}
}
