class Solution {
    public int[] findDegrees(int[][] m) {
        int n = m.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i] += m[i][j];
            }
        }
        return ans;
    }
}
