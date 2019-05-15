package leetcode.no0009;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(-1));
        System.out.println(new Solution().isPalindrome(0));
        System.out.println(new Solution().isPalindrome(1));
        System.out.println(new Solution().isPalindrome(2));
        System.out.println(new Solution().isPalindrome(10));
        System.out.println(new Solution().isPalindrome(12345));
        System.out.println(new Solution().isPalindrome(67876));
        System.out.println(new Solution().isPalindrome(Integer.MAX_VALUE));
        System.out.println(new Solution().isPalindrome(Integer.MIN_VALUE));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int number = x;
        long reversed = 0;
        while (number != 0) {
            int pop = number % 10;
            number /= 10;
            reversed = reversed * 10 + pop;
        }
        return reversed == x;
    }

    public boolean s(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
}