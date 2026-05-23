class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Set<Integer> traveldays=new HashSet<>();
        for(int day:days)
        {
            traveldays.add(day);
        }
        int lastday=days[days.length-1];
        int[] dp=new int[lastday+1];

        for(int i =1;i<=lastday;i++)
        {
            if(!traveldays.contains(i))
            {
                dp[i]=dp[i-1];
            }
            else{
                dp[i]=Math.min(
                    dp[i-1]+costs[0],
                    Math.min(
                        dp[Math.max(0,i-7)]+costs[1],
                        dp[Math.max(0,i-30)]+costs[2]
                    )
                );
            }


        }
        return dp[lastday];
    }
}