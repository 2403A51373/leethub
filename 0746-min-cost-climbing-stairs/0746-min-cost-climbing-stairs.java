class Solution {
    /*
    int fun(int a[] , int id , int m[]){
        if(id >= a.length){ return 0;}
        if(m[id]!=-1){   return m[id]; }
        m[id] = a[id] + Math.min(fun(a,id+1 , m) , fun(a,id+2,m));
        return m[id];
    }
    public int minCostClimbingStairs(int[] a) {
        int m [] = new int[a.length];
        Arrays.fill(m,-1);
        return Math.min(fun(a,0 , m) , fun(a,1 , m));
    }
    */
    public int minCostClimbingStairs(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        for(int i = 2; i < nums.length ; i++){
            int min = nums[i] + Math.min(a,b);
            a = b;
            b = min;
        }
        return Math.min(a,b);

    }
}