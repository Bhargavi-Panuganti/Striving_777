class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            profit=Math.max(profit, Math.abs(prices[i]-min));
        }

        return profit;
    }
}