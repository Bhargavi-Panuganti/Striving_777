class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int total=0;
        int cursum=0;

        for(int i=satisfaction.length-1;i>=0;i--)
        {
            cursum+=satisfaction[i];
            if(cursum<=0)break;

            total+=cursum;
        }

        return total;
    }
}