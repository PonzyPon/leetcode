package leetcode.no0141;

import java.util.HashSet;
import java.util.Set;

import leetcode.common.ListNode;

class Solution {

    public static void main(String[] args) {
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }

}
