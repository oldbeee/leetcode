package com.qiyi.biwangshen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Solution {
	public List<Integer> topKFrequent(int[] nums,int k){
		Map hash = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(hash.containsKey(nums[i])){
				int frequnce = (int) hash.get(nums[i]);
				frequnce = frequnce +1;
				hash.put(nums[i], frequnce);
			}else{
				hash.put(nums[i], 1);
			}
		}
		TreeMap<Integer,List<Integer>> invertedIndex = new TreeMap<>();
		for(Object key:hash.keySet()){
			int freq = (int) hash.get(key);
			if(!invertedIndex.containsKey(freq)){
				List<Integer> keys = new ArrayList<>();
				keys.add((Integer) key);
				invertedIndex.put(freq, keys);
			}else{
				invertedIndex.get(freq).add((Integer) key);
			}
		}
		int i = 0;
		List<Integer> result = new ArrayList<>();
		for(Integer freq:invertedIndex.descendingKeySet()){
			for(Integer key:invertedIndex.get(freq)){
				if(i>=k){
					return result;
				}
				result.add(key);
				i++;
			}
		}
		return result;
	}
}
