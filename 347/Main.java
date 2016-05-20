package com.qiyi.biwangshen;

import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Main {
	public static void main(String[] args){
		int[] a ={1};
		int k =1;
		Solution solution = new Solution();
		List<Integer> result = solution.topKFrequent(a,k);
		System.out.println(result);
	}
}
