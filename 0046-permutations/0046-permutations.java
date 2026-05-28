class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> wraplist = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        ArrayList<Integer> ans = new ArrayList<>();
        solve(nums, 0, wraplist, ans, freq);
        return wraplist;
    }

    public void solve(int[] nums, int ind, List<List<Integer>> wraplist, ArrayList<Integer> ans, boolean[] freq) {
        if (nums.length == ans.size()){
            wraplist.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i] == true) {
                freq[i] = true;
                ans.add(nums[i]);
                solve(nums, i + 1, wraplist, ans, freq);
                ans.remove(ans.size() - 1);
                freq[i] = false;
            }
        }
    }
}