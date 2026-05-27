class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int len=nums.length;
        int subsets=1<<len;
        int result=0;
        List<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<subsets;i++)
        {
            int temp=0;
            ArrayList<Integer> l=new ArrayList<>();
            for(int j=0;j<len;j++)
            {
                if((i&(1<<j))!=0)
                {
                    l.add(nums[j]);
                }
            }
            a.add(l);
            
        }
        return a;
    }
}