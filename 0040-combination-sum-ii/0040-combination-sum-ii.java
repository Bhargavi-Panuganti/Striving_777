class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(candidates);
        return combo(0,candidates,target,ans,ds);
         
    }

    public List<List<Integer>> combo(int ind,int[]arr, int target,List<List<Integer>> ds,List<Integer> ans)
    {
        if(target==0)  {
            ds.add(new ArrayList<>(ans));
            return ds;
        }

        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;

            ans.add(arr[i]);
            combo(i+1,arr,target-arr[i],ds,ans);
            ans.remove(ans.size()-1);
        }

        return ds;
    }
}