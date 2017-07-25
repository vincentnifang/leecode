package com.test.leecode.medium;

/**
 * Created by vincent on 2017/7/25.
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val;
        boolean isPlus1 = false;
        if (val >= 10) {
            val = val - 10;
            isPlus1 = true;
        }
        ListNode ln = new ListNode(val);
        if (l1.next != null || l2.next != null) {
            ln.next = addTwoNumbers(l1.next, l2.next, isPlus1);
        } else if (isPlus1) {
            ln.next = new ListNode(1);
        }
        return ln;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, boolean isPlus1) {

        if (l1 == null) {
            l1 = new ListNode(0);
        }

        if (l2 == null) {
            l2 = new ListNode(0);
        }
        if (isPlus1) {
            l1.val++;
        }
        return addTwoNumbers(l1, l2);
    }


}
