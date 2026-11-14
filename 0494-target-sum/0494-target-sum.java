class Solution {
    int c = 0;
    public void find(int nums[] , int i , int s , int t){
        if(i>=nums.length){
            if(s==t){c++;}
            return;
        }
        find(nums,i+1,s+nums[i],t);
        find(nums,i+1,s-nums[i],t);
    }
    public int findTargetSumWays(int[] nums, int target) {
        find(nums, 0 , 0 , target);
        return c;
    }
}