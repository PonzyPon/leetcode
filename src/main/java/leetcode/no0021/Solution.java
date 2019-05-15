package leetcode.no0021;

import leetcode.common.ListNode;

class Solution {

    public static void main(String[] args) {
        ListNode node1_1 = new ListNode(1);
        ListNode node1_2 = new ListNode(2);
        ListNode node1_3 = new ListNode(4);
        node1_1.next = node1_2;
        node1_2.next = node1_3;
        ListNode node2_1 = new ListNode(1);
        ListNode node2_2 = new ListNode(3);
        ListNode node2_3 = new ListNode(4);
        node2_1.next = node2_2;
        node2_2.next = node2_3;
        new Solution().mergeTwoLists(node1_1, node2_1);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode header = new ListNode(0);
        ListNode currentNode = header;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }
        if (l1 != null) {
            currentNode.next = l1;
        }
        if (l2 != null) {
            currentNode.next = l2;
        }
        return header.next;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newhead = new ListNode(0);
        ListNode curNode = newhead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curNode.next = l1;
                l1 = l1.next;
            } else {
                curNode.next = l2;
                l2 = l2.next;
            }
            curNode = curNode.next;
        }

        if (l1 != null) {
            curNode.next = l1;
        }
        if (l2 != null) {
            curNode.next = l2;
        }

        return newhead.next;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode test = new ListNode(0);
        ListNode result = test;

        if (l1.val >= l2.val) {
            result = l2;
            l2 = l2.next;
            result.next = mergeTwoLists(l1, l2);
        } else {
            result = l1;
            l1 = l1.next;
            result.next = mergeTwoLists(l1, l2);
        }

        return result;
    }
}
