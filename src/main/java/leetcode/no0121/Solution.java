package leetcode.no0121;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[] { 1, 2, 3 }));
        System.out.println(new Solution().maxProfit(new int[] { 3, 2, 3 }));
        System.out.println(new Solution().maxProfit(new int[] { 3, 10, 1, 100 }));
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int m = i + 1; m < prices.length; m++) {
                int profit = prices[m] - prices[i];
                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

}
