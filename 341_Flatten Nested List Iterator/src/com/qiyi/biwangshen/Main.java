package com.qiyi.biwangshen;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List nestedList = new ArrayList();
		List nestedList1 = new ArrayList();
		List nestedList2 = new ArrayList();
		nestedList1.add(3);
		nestedList1.add(6);
		nestedList2.add(2);
		nestedList2.add(4);
		nestedList.add(1);
		nestedList.add(nestedList1);
		nestedList.add(5);
		nestedList.add(nestedList2);
		NestedIterator test = new NestedIterator(nestedList);
		List v =new ArrayList<NestedInteger>();
		while (test.hasNext()){
			v.add(test.next());
		}
		
	}

}
