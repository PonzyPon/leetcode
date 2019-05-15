package leetcode.no0104;

import leetcode.common.TreeNode;

class Solution {

    public static void main(String[] args) {
        // new Solution().maxDepth(null);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
