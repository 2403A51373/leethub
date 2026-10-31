class Solution {
    public int climbStairs(int n) {
        int o = 1;
        int t = 1;
        for(int i = 2 ; i <= n ; i++){
            int te = o + t;
            o = t;
            t = te;
        }
        return t;
    }
}