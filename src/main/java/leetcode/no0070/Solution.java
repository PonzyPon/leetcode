package leetcode.no0070;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(1));
        System.out.println(new Solution().climbStairs(2));
        System.out.println(new Solution().climbStairs(3));
        System.out.println(new Solution().climbStairs(4));
        System.out.println(new Solution().climbStairs(5));
        System.out.println(new Solution().climbStairs(6));
        System.out.println(new Solution().climbStairs(7));
        System.out.println(new Solution().climbStairs(8));
        System.out.println(new Solution().climbStairs(9));
        System.out.println(new Solution().climbStairs(10));
        System.out.println(new Solution().climbStairs(11));
        System.out.println(new Solution().climbStairs(20));
        System.out.println(new Solution().climbStairs(30));
        System.out.println(new Solution().climbStairs(40));
    }

    Map<Integer, Integer> stepMap = new HashMap<>();

    public int climbStairs(int m) {
        if (m <= 3) {
            return m;
        }
        if (stepMap.containsKey(m)) {
            return stepMap.get(m);
        }
        int steps = climbStairs(m - 1) + climbStairs(m - 2);
        stepMap.put(m, steps);
        return steps;
    }

    public int climbStairs2(int m) {
        if (m <= 3) {
            return m;
        }
        return climbStairs(m - 1) + climbStairs(m - 2);
    }

    public int climbStairs3(int n) {
        if (n < 4) {
            return n;
        }
        double root5 = Math.sqrt(5);
        return (int) Math.round(Math.pow((1 + root5) / 2, n + 1) / root5);
    }

    public int climbStairs4(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
