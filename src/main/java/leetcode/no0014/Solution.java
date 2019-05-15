package leetcode.no0014;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[] { "flower", "flow", "flight" })); // "fl"
        System.out.println(new Solution().longestCommonPrefix(new String[] { "flower", "flow", "flight" })); // "fl"
        System.out.println(new Solution().longestCommonPrefix(new String[] { "racecar", "car", "dog" })); // ""
        System.out.println(new Solution().longestCommonPrefix(new String[] { "flower", "flow", "flight" })); // "fl"
        System.out.println(new Solution().longestCommonPrefix(new String[] { "doga" })); // dog?
    }

    public String longestCommonPrefix(String[] strs) {
        int strsLength = strs.length;
        int minLength = strs[0].length();
        int minLengthIndex = 0;
        String minLengthWord = strs[0];
        for (int i = 1; i < strsLength; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
                minLengthIndex = i;
                minLengthWord = strs[i];
            }
        }

        for (int i = minLengthWord.length(); i > 0; i--) {
            String commonPrefix = minLengthWord.substring(0, i);
            boolean isCommonPrefix = true;
            for (int m = 0; m < strsLength; m++) {
                if (m == minLengthIndex) {
                    continue;
                }
                if (!strs[m].startsWith(commonPrefix)) {
                    isCommonPrefix = false;
                    break;
                }
            }
            if (isCommonPrefix) {
                return commonPrefix;
            }
        }

        return "";
    }

}