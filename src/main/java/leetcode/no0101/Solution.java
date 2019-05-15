package leetcode.no0101;

import leetcode.common.TreeNode;

class Solution {

    public static void main(String[] args) {
        new Solution().isSymmetric(null);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        reverseTree(root.left);
        return isSameTree(root.left, root.right);
    }

    private void reverseTree(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        reverseTree(node.left);
        reverseTree(node.right);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
