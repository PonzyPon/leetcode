package leetcode.no0122;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[] { 1, 2, 3 }));
        System.out.println(new Solution().maxProfit(new int[] { 3, 2, 3 }));
        System.out.println(new Solution().maxProfit(new int[] { 3, 10, 1, 100 }));
        System.out.println(new Solution().maxProfit(new int[] { 3, 10, 1, 100 }));
        System.out.println(new Solution().maxProfit(new int[] { 7, 3, 5, 1 }));
        System.out.println(new Solution().maxProfit(new int[] { 0 }));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = -1;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (buyPrice < 0) {
                buyPrice = price;
                continue;
            }
            if (buyPrice > price) {
                buyPrice = price;
                continue;
            }
            if (buyPrice < price && (i + 1 == prices.length || price >= prices[i + 1])) {
                maxProfit += (price - buyPrice);
                buyPrice = -1;
            }
        }
        return maxProfit;
    }

}
