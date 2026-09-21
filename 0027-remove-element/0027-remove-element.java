class Solution {
    public int removeElement(int[] nums, int val) {
       int i = 0;
       int j = 0;
        while(j<nums.length){
            if(nums[j] != val){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
            j++;
       }
       return i;
       
    }
}