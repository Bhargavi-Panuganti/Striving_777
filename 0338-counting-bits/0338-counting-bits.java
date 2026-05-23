class Solution {
    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        
        if(dp.length<=1)return dp;
        dp[1]=1;

        for(int i=2;i<=n;i++)
        {
            if(i%2==0)
            {
                dp[i]=dp[i/2];
            }
            else dp[i]=dp[i-1]+1;
        }

        return dp;
    }
}