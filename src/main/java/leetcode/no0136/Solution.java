package leetcode.no0136;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[] { 1, 2, 1 }));
    }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.stream().findFirst().get();
    }

}
