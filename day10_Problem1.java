class Solution {
    public int maxProfit(int[] prices) {
        int minim = prices[0];
        int maxim = 0;

        for (int i = 1; i < prices.length; i++) {
            minim = Math.min(minim, prices[i]);
            maxim = Math.max(maxim, prices[i] - minim);
        }

        return maxim;
    }
}

// TC : O(n)
// SC : O(1)