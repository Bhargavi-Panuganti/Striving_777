class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ds=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        call(candidates,target,a,ds,0);
        return ds;
    }

    public void call(int[] nums,int tar,ArrayList<Integer> ans,List<List<Integer>> ds,int ind)
    {
        if(tar==0)
        {
            ds.add(new ArrayList<>(ans));
            return;
        }

        for(int i=ind;i<nums.length;i++)
        {
            if(nums[i]<=tar){
            ans.add(nums[i]);
            call(nums,tar-nums[i],ans,ds,i);
            ans.remove(ans.size()-1);
            }
        }
    }
}