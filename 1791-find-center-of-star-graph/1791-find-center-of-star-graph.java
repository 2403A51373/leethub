class Solution {
    public int findCenter(int[][] m) {
        if(m[0][1] == m[1][0]){ return m[0][1]; }
        if(m[0][1] == m[1][1]){ return m[1][1]; }
        return m[0][0];
    }
}