class Solution {
    public int findTargetSumWays(int[] num, int target) {
        int n=num.length;
        int total=0;
        for(int nu:num)total+=nu;
        int sum=(target+total)/2;
        if ((target + total) % 2 != 0 || target > total || target < -total)
            return 0;
        int[] dp=new int[sum+1];
        dp[0]=1;

        for(int i=1;i<=num.length;i++)
        {
            for(int j=sum;j>=num[i-1];j--)
            {
                dp[j]+=dp[j-num[i-1]];
            }
        }
        return dp[sum];
    }
}