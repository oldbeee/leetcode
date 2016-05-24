package com.qiyi.biwangshen;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class NestedIterator implements Iterator<Integer> {
	Stack<Iterator<NestedInteger>> stack;
    Iterator<NestedInteger> itr;
    NestedInteger cur;
    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new Stack();
        itr = nestedList.iterator();
        cur = null;
    }
    @Override
    public Integer next() {
        Integer x = cur.getInteger();
        cur = null;
        return x;
    }
    @Override
    public boolean hasNext() {
        if (cur != null) return true;
        while (!stack.isEmpty() || itr.hasNext()) {
            while (itr.hasNext()) {
                cur = itr.next();
                if (cur.isInteger()) return true;
                else {
                    stack.push(itr);
                    itr = cur.getList().iterator();
                }
            }
            itr = stack.pop();
        }
        return false;
    }
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
