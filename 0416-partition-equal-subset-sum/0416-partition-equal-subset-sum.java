class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++) sum+=nums[i];
        if(sum%2==1)return false;
        int target=sum/2;
        boolean[][] dp=new boolean[n+1][target+1];
         
         for(int i=0;i<=n;i++)dp[i][0]=true;

        return solve(nums,sum/2,dp);
    }

    public boolean solve(int[] nums,int sum,boolean[][] dp)
    {

        for(int i=1;i<=nums.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                dp[i][j]=dp[i-1][j];
                if(nums[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[nums.length][sum];
    }
}