package com.qiyi.wangshenbi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
	public int[] intersection(int[] a,int[] b){
		HashSet<Integer> a1 = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
			a1.add(a[i]);
		List<Integer> tmp = new ArrayList<Integer>();
		for(int i=0;i<b.length;i++){
			if(a1.contains(b[i])){
				tmp.add(b[i]);
				a1.remove(b[i]);
				//System.out.println(b.length);
			}
		}
		int result[] = new int[tmp.size()];
		for(int i=0;i<result.length;i++){
			result[i] = tmp.get(i);
		}
		return result;
	}

}
