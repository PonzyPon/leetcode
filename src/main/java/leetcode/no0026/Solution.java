package leetcode.no0026;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[] { 1, 1, 2 }));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int number = nums[0];
        int pointerIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (number < nums[i]) {
                if (pointerIndex != i) {
                    nums[pointerIndex] = nums[i];
                }
                number = nums[i];
                pointerIndex++;
            }
        }
        return pointerIndex;
    }
}
