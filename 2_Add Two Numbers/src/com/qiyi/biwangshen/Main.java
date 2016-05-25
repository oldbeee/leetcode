package com.qiyi.biwangshen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(5);
		solution.addTwoNumbers(l1, l2);
	}

}
