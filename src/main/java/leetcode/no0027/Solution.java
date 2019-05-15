package leetcode.no0027;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(new int[] { 1, 1, 2 }, 1));
        System.out.println(new Solution().removeElement(new int[] { 1, 1, 2 }, 2));
    }

    public int removeElement(int[] nums, int val) {
        int pointerIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointerIndex++] = nums[i];
            }
        }
        return pointerIndex;
    }
}
