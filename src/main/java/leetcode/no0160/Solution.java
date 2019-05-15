package leetcode.no0160;

import java.util.HashSet;
import java.util.Set;

import leetcode.common.ListNode;

class Solution {

    public static void main(String[] args) {
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode tail = headA;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = headB;

        ListNode p1 = headA;
        ListNode p2 = headA;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                ListNode q = p2;
                ListNode k = headA;
                while (q != null) {
                    if (q == k) {
                        tail.next = null;
                        return q;
                    }
                    q = q.next;
                    k = k.next;
                }
            }

        }
        tail.next = null;
        return null;
    }

}
