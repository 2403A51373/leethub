class Solution {
    int h(int nums [] , int idx , int m []){
        if(idx >=nums.length){return 0;}
        if(m[idx]!=-1){return m[idx];}
        m[idx] = nums[idx] + Math.max(h(nums,idx+2, m) , h(nums,idx+3 , m));
        return m[idx];
    }
    public int rob(int[] nums) {
        int m [] = new int[nums.length];
        Arrays.fill(m,-1);
        return Math.max(h(nums,0 , m),h(nums,1 , m));
    }
    /*
    int h(int nums [] , int idx){
        if(idx >=nums.length){return 0;}
        if(m[idx]!=-1){return m[idx];}
        int r = nums[idx] + h(nums,idx+2);
        int nr = h(nums,idx+1);
        return Math.max(r,nr);
    }
    public int rob(int[] nums) {
        return Math.max(h(nums,0),h(nums,1));
    }
    */
}