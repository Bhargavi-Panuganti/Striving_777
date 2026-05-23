class Solution {
    public void reverse(int[] nums,int st,int end)
    {
        while(st<=end)
        {
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st+=1;
            end-=1;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==1)return;
        if(nums.length<k){
            k=k%n;
        }
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}