class Solution {
    public int lastStoneWeightII(int[] stones) {
        int total=0;
        for(int i=0;i<stones.length;i++)total+=stones[i];
        int sum=total/2;
        int[] dp=new int[sum+1];

        for(int i=1;i<=stones.length;i++)
        {
            for(int j=sum;j>=stones[i-1];j--)
            {
                dp[j]=Math.max(dp[j], dp[j - stones[i-1]] + stones[i-1]); 
            }
        }

        return total - 2 * dp[sum];

    }
}