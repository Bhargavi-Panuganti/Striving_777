class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        backtrack(nums,ls,0,new ArrayList<>());
        return ls;
    }

    public void backtrack(int[]nums, List<List<Integer>> ls,int ind,List<Integer> arr)
    {
        ls.add(new ArrayList<>(arr));

        for(int i=ind;i<nums.length;i++)
        {
            arr.add(nums[i]);
            backtrack(nums,ls,i+1,arr);
            arr.remove(arr.size()-1);
        }
    }
}