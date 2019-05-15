package leetcode.no0083;

import leetcode.common.ListNode;

class Solution {

    public static void main(String[] args) {
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode header = new ListNode(0);
        header.next = head;
        ListNode currentNode = head;
        head = head.next;
        while (head != null) {
            if (currentNode.val != head.val) {
                currentNode.next = head;
                currentNode = currentNode.next;
            } else {
                currentNode.next = head.next;
            }
            head = head.next;
        }
        return header.next;
    }

}
